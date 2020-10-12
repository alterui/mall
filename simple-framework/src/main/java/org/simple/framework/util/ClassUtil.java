package org.simple.framework.util;

import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.FileFilter;
import java.net.URL;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Class解析相关工具类
 *
 * @author liurui
 * @date 2020/9/28 6:24 下午
 */
@Slf4j
public class ClassUtil {


    public static final String FILE_PROTOCOL = "file";

    /**
     * 扫描包下面所有的class
     * 过程：
     *  1. 获取到类的加载器
     *  2. 通过类的加载器获取到加载的资源
     *  3. 依据不同的资源类型，采用不同的方式获取资源的集合
     *
     * @param packageName
     * @return
     */
    public static Set<Class<?>> extractPackageClass(String packageName) {
        ClassLoader classLoader = getClassLoader();

        URL url = classLoader.getResource(packageName.replace(".", "/"));
        if (Objects.isNull(url)) {
            log.warn("unable to retrieve anything from package:{}", packageName);
            return null;
        }

        Set<Class<?>> classSet = null;
        if (Objects.equals(FILE_PROTOCOL, url.getProtocol())) {
            File fileSource = new File(url.getPath());
            classSet = new HashSet<>();
            extractClassFile(fileSource,classSet,packageName);

        }
        return classSet;
    }

    /**
     * 需要递归提取class文件
     * @param fileSource
     * @param classSet
     * @param packageName
     */
    private static void extractClassFile(File fileSource, Set<Class<?>> classSet, String packageName) {
        //停止条件：当前目录是不是文件夹
        if (!fileSource.isDirectory()) {
            return;
        }

        //获取所有文件夹和文件，并添加过滤条件，如果是.class文件直接提取
        File[] files = fileSource.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if (pathname.isDirectory()) {
                    return true;
                } else {
                    //表明是文件，需要.class的文件
                    if (pathname.getAbsolutePath().endsWith(".class")) {
                        //提取文件
                        addClassToSet(pathname.getAbsolutePath());
                    }


                }
                return false;
            }

            private void addClassToSet(String absolutePath) {
                //将当前类的包名添加进去
                absolutePath = absolutePath.replace(File.separator, ".");
                String className = absolutePath.substring(absolutePath.indexOf(packageName));
                //去除掉.class
                className = className.substring(0, className.lastIndexOf("."));
                //反射获取class，并添加去classSet里面
                classSet.add(loadClass(className));

            }
        });
        if (files != null) {
            for (File file : files) {
                extractClassFile(file, classSet, packageName);
            }
        }

    }

    public static Class<?> loadClass(String packageName) {
        try {
            return Class.forName(packageName);
        } catch (ClassNotFoundException e) {
            log.warn("class not found..");
            return null;
        }

    }



    /**
     * 获取classLoader
     *
     * @return
     */
    public static ClassLoader getClassLoader() {

        return Thread.currentThread().getContextClassLoader();
    }

    public static void main(String[] args) {
        extractPackageClass("com.lr.entity");
    }

}
