package com.lr.mall.utils;



import com.google.common.collect.Lists;

import java.io.File;
import java.net.JarURLConnection;
import java.net.URL;
import java.net.URLDecoder;
import java.util.Enumeration;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

/**
 * @author liurui
 * @date 2020/7/30 2:34 下午
 */
public class ClassScanUtil {

    public static List<Class<?>> getClasses(String packageName) throws Exception {
        List<Class<?>> classes = Lists.newArrayList();
        String packageDirName = packageName.replace('.', '/');
        Enumeration<URL> dirs;

        dirs = Thread.currentThread().getContextClassLoader().getResources(packageDirName);
        while (dirs.hasMoreElements()) {
            URL url = dirs.nextElement();
            String protocol = url.getProtocol();
            if ("file".equals(protocol)) {
                String filePath = URLDecoder.decode(url.getFile(), "UTF-8");
                findAndAddClassesInPackageByFile(packageName, filePath, classes);
            } else if ("jar".equals(protocol)) {
                JarFile jar;

                jar = ((JarURLConnection) url.openConnection()).getJarFile();
                Enumeration<JarEntry> entries = jar.entries();
                while (entries.hasMoreElements()) {
                    JarEntry entry = entries.nextElement();
                    String name = entry.getName();
                    if (name.charAt(0) == '/') {
                        name = name.substring(1);
                    }
                    if (name.startsWith(packageDirName)) {
                        int idx = name.lastIndexOf('/');
                        if (idx != -1) {
                            packageName = name.substring(0, idx).replace('/', '.');
                            if (name.endsWith(".class") && !entry.isDirectory()) {
                                String className = name.substring(packageName.length() + 1, name.length() - 6);
                                classes.add(Class.forName(packageName + '.' + className));
                            }
                        }
                    }
                }
            }
        }
        return classes;
    }

    public static void findAndAddClassesInPackageByFile(String packageName, String packagePath, List<Class<?>> classes) throws Exception {
        File dir = new File(packagePath);
        if (!dir.exists() || !dir.isDirectory()) {
            return;
        }
        File[] dirFiles = dir.listFiles(file -> (file.isDirectory()) || (file.getName().endsWith(".class")));
        if (dirFiles == null) {
            return;
        }
        for (File file : dirFiles) {
            if (file.isDirectory()) {
                findAndAddClassesInPackageByFile(packageName + "." + file.getName(), file.getAbsolutePath(), classes);
            } else {
                String className = file.getName().substring(0, file.getName().length() - 6);
                classes.add(Class.forName(packageName + '.' + className));

            }
        }
    }

    public static void main(String[] args) {
        try {
            getClasses("com.lr.mall");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
