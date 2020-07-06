package com.lr.mall.thread;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @author liurui
 * @date 2020/7/1 2:57 下午
 */
public class JsonApplicaotn {
    public static void main(String[] args) {
        String json = "[\n" +
                "{\"phone\":\"Cathy-15251612973\",\"title\":\"电机定子工艺工程师\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Xueli-18621704256\",\"title\":\"电池工艺工程师\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Joan-18825192583\",\"title\":\"交付支持专员，长沙\",\"parseId\":79,\"city\":\"长沙\"},\n" +
                "{\"phone\":\"Joan-18825192583\",\"title\":\"交付支持专员，广州\",\"parseId\":79,\"city\":\"广州\"},\n" +
                "{\"phone\":\"Joan-18825192583\",\"title\":\"产品销售专员，南宁\",\"parseId\":79,\"city\":\"南宁\"},\n" +
                "{\"phone\":\"Joan-18825192583\",\"title\":\"产品销售专员，广州\",\"parseId\":79,\"city\":\"广州\"},\n" +
                "{\"phone\":\"Troy-13917747423\",\"title\":\"暖通设计工程师（中级职称）\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Ronat-18117131813\",\"title\":\"电机设备工程师\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Xueli-18621704256\",\"title\":\"电池设备工程师\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Vera-13795309703\",\"title\":\"税务专员Tax Specialist (base in Shanghai Lingang)\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Mika-17301832967\",\"title\":\"高级财务分析师（工厂制造），临港\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Mika-17301832967\",\"title\":\"网络工程师\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Mika-17301832967\",\"title\":\"IT技术支持工程师 - 临港\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"王嘉玮-18810366045\",\"title\":\"销售主管\",\"parseId\":79,\"city\":\"北京\"},\n" +
                "{\"phone\":\"王嘉玮-18810366045\",\"title\":\"零售体验店店长\",\"parseId\":79,\"city\":\"天津,沈阳,郑州\"},\n" +
                "{\"phone\":\"\",\"title\":\"维修技师\",\"parseId\":79,\"city\":\"郑州,重庆,成都,贵阳,昆明,西安\"},\n" +
                "{\"phone\":\"Joan-18825192583\",\"title\":\"维修技师\",\"parseId\":79,\"city\":\"福州,厦门,深圳\"},\n" +
                "{\"phone\":\"Joan-18825192583\",\"title\":\"交付支持专员\",\"parseId\":79,\"city\":\"厦门,深圳\"},\n" +
                "{\"phone\":\"Candice-15000188334\",\"title\":\"Software Engineer, Mobile App 软件工程师，移动App | React Native\",\"parseId\":79,\"city\":\"北京,上海\"},\n" +
                "{\"phone\":\"Joan-18825192583\",\"title\":\"销售主管\",\"parseId\":79,\"city\":\"厦门,深圳,东莞\"},\n" +
                "{\"phone\":\"\",\"title\":\"维修技师, 北京亦庄/花乡\",\"parseId\":79,\"city\":\"北京\"},\n" +
                "{\"phone\":\"Joan-18825192583\",\"title\":\"零售体验店店长\",\"parseId\":79,\"city\":\"厦门,深圳\"},\n" +
                "{\"phone\":\"\",\"title\":\"客户支持专员\",\"parseId\":79,\"city\":\"大连\"},\n" +
                "{\"phone\":\"David-18918373715\",\"title\":\"电机工艺经理\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"张晓桐-15821496102\",\"title\":\"产品销售专家\",\"parseId\":79,\"city\":\"苏州,温州\"},\n" +
                "{\"phone\":\"Joan-18825192583\",\"title\":\"产品销售专家\",\"parseId\":79,\"city\":\"福州,厦门,深圳,东莞\"},\n" +
                "{\"phone\":\"王嘉玮-18810366045\",\"title\":\"产品销售专家\",\"parseId\":79,\"city\":\"北京,天津,沈阳,青岛,郑州,西安\"},\n" +
                "{\"phone\":\"Joan-18825192583\",\"title\":\"钣喷业务配件顾问\",\"parseId\":79,\"city\":\"深圳\"},\n" +
                "{\"phone\":\"Sunny-18751964800\",\"title\":\"Manufacturing Test Software Engineer 软件测试工程师\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Vera-13795309703\",\"title\":\"对外区域政府事务经理\",\"parseId\":79,\"city\":\"南京,杭州,武汉\"},\n" +
                "{\"phone\":\"Kim-13818925449\",\"title\":\"维修技师\",\"parseId\":79,\"city\":\"南京,常州,苏州,宁波,温州\"},\n" +
                "{\"phone\":\"\",\"title\":\"Sr. HRBP\",\"parseId\":79,\"city\":\"深圳\"},\n" +
                "{\"phone\":\"\",\"title\":\"Ecommerce Manager\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Vera-13795309703\",\"title\":\"对外政府事务经理\",\"parseId\":79,\"city\":\"北京\"},\n" +
                "{\"phone\":\"Kim-13818925449\",\"title\":\"客户支持专员-上海临港\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Joan-18825192583\",\"title\":\"配件顾问，广州\",\"parseId\":79,\"city\":\"广州\"},\n" +
                "{\"phone\":\"Sarah-13524167281\",\"title\":\"配件顾问\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Joan-18825192583\",\"title\":\"服务顾问，广州/长沙\",\"parseId\":79,\"city\":\"长沙,广州\"},\n" +
                "{\"phone\":\"Joan-18825192583\",\"title\":\"交付支持专员，武汉\",\"parseId\":79,\"city\":\"武汉\"},\n" +
                "{\"phone\":\"Joan-18825192583\",\"title\":\"维修技师，广州/佛山/武汉/长沙/南昌/南宁\",\"parseId\":79,\"city\":\"南昌,武汉,长沙,广州,佛山,南宁\"},\n" +
                "{\"phone\":\"张晓桐-15821496102\",\"title\":\"产品销售专家 特斯拉汽车（直营）Product Specialist\",\"parseId\":79,\"city\":\"杭州\"},\n" +
                "{\"phone\":\"张晓桐-15821496102\",\"title\":\"特斯拉-产品销售专家-上海金桥\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Ronat-18117131813\",\"title\":\"总装生产经理\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Ronat-18117131813\",\"title\":\"场内泊运控制专员\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Ronat-18117131813\",\"title\":\"物流规划工程师\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Ronat-18117131813\",\"title\":\"物料操作主管\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Sarah-13524167281\",\"title\":\"服务顾问\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Xueli-18621704256\",\"title\":\"Supplier Quality Assurance 供应商质量保证工程师\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Susan-18516190077\",\"title\":\"Supplier Industrialization Engineer 供应商开发和质量工程师\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Susan-18516190077\",\"title\":\"Supply Operation Manager - Direct Material 采购运营经理-直采\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Wendy-13522812901\",\"title\":\"Application Support Engineer\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Diana-18001996756\",\"title\":\"Software QA engineer\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Candice-15000188334\",\"title\":\"后端开发工程师\",\"parseId\":79,\"city\":\"北京,上海\"},\n" +
                "{\"phone\":\"Diana-18001996756\",\"title\":\"WMS Support Engineer\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Diana-18001996756\",\"title\":\"ERP Support Engineer\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Diana-18001996756\",\"title\":\"数据工程师\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Diana-18001996756\",\"title\":\"软件开发工程师（GO/Java/Python）\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Diana-18001996756\",\"title\":\"MES /WMS系统支持工程师\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Mika-17301832967\",\"title\":\"资金会计(Cashier方向)\",\"parseId\":79,\"city\":\"北京\"},\n" +
                "{\"phone\":\"Mika-17301832967\",\"title\":\"应付会计\",\"parseId\":79,\"city\":\"北京\"},\n" +
                "{\"phone\":\"\",\"title\":\"订单运营专员\",\"parseId\":79,\"city\":\"北京\"},\n" +
                "{\"phone\":\"\",\"title\":\"资深订单运营专员\",\"parseId\":79,\"city\":\"北京\"},\n" +
                "{\"phone\":\"\",\"title\":\"资深数字营销专家\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"\",\"title\":\"文案编辑\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"\",\"title\":\"资深平面设计师\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Troy-13917747423\",\"title\":\"EHS专员\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Sunny-18751964800\",\"title\":\"消防工程师\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Sunny-18751964800\",\"title\":\"土建工程师\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Sunny-18751964800\",\"title\":\"设施机械工程师（冷冻水 &工艺冷却水）\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Sunny-18751964800\",\"title\":\"设施机械工程师（热水系统&压缩空气系统）\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Sunny-18751964800\",\"title\":\"厂务运维-水处理工程师\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Sunny-18751964800\",\"title\":\"厂务运维-电气工程师\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"\",\"title\":\"薪酬福利顾问，大中华区\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Susan-18516190077\",\"title\":\"CAPEX采购经理\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"\",\"title\":\"内审高级经理\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Susan-18516190077\",\"title\":\"供应链开发管理工程师（电池）\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Mika-17301832967\",\"title\":\"关务专员\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Mika-17301832967\",\"title\":\"资金会计（Cashier方向）\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Mika-17301832967\",\"title\":\"（高级）应付会计\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Mika-17301832967\",\"title\":\"IT门店支持工程师（新建+运维）\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Mika-17301832967\",\"title\":\"数据库工程师\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Mika-17301832967\",\"title\":\"高级无线网络工程师\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Mika-17301832967\",\"title\":\"存储工程师\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Mika-17301832967\",\"title\":\"基础架构工程师\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Diana-18001996756\",\"title\":\"法律顾问 (采购)\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Diana-18001996756\",\"title\":\"法律顾问 (工程/充电)\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Diana-18001996756\",\"title\":\"合规法律顾问\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"\",\"title\":\"维修技师\",\"parseId\":79,\"city\":\"天津,沈阳,青岛\"},\n" +
                "{\"phone\":\"Sunny-18751964800\",\"title\":\"热管理工程师\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Sunny-18751964800\",\"title\":\"家庭充电项目专员\",\"parseId\":79,\"city\":\"上海,深圳\"},\n" +
                "{\"phone\":\"Sunny-18751964800\",\"title\":\"充电安装项目经理\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Susan-18516190077\",\"title\":\"技术项目经理-Infrastructure\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Troy-13917747423\",\"title\":\"环境专员\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Troy-13917747423\",\"title\":\"消防安全工程师\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Troy-13917747423\",\"title\":\"EHS Specialist 安全工程师（铸造/动力总成/焊装）\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Sunny-18751964800\",\"title\":\"充电桩安装专员\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Sunny-18751964800\",\"title\":\"充电桩勘测开发专员\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Xueli-18621704256\",\"title\":\"Module/Pack设备经理\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Troy-13917747423\",\"title\":\"设计项目经理\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Troy-13917747423\",\"title\":\"室内设计工程师\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"\",\"title\":\"国补运营专员\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"\",\"title\":\"售后系统项目经理\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Sarah-13524167281\",\"title\":\"售后服务顾问\",\"parseId\":79,\"city\":\"上海,南京,苏州,杭州,宁波,温州\"},\n" +
                "{\"phone\":\"Sarah-13524167281\",\"title\":\"售后配件顾问\",\"parseId\":79,\"city\":\"上海,南京,苏州,杭州,宁波,温州\"},\n" +
                "{\"phone\":\"Kim-13818925449\",\"title\":\"客户支持专员\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Sarah-13524167281\",\"title\":\"维修技师\",\"parseId\":79,\"city\":\"上海,南京,苏州,杭州,宁波,温州\"},\n" +
                "{\"phone\":\"Candice-15000188334\",\"title\":\"Software Engineer, Infotainment (frontend) 软件工程师，信息娱乐系统（前端开发）\",\"parseId\":79,\"city\":\"北京,上海\"},\n" +
                "{\"phone\":\"Sarah-13524167281\",\"title\":\"服务顾问\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Xueli-18621704256\",\"title\":\"自动化控制工程师\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Ronat-18117131813\",\"title\":\"自动化控制经理\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"\",\"title\":\"车联网运维工程师\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"\",\"title\":\"车辆性能工程师\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Candice-15000188334\",\"title\":\"Product Support Engineer, Autopilot  产品支持工程师，自动辅助驾驶系统\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Sarah-13524167281\",\"title\":\"特斯拉直营-售后配件顾问-上海虹桥\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Joan-18825192583\",\"title\":\"特斯拉-车辆交付顾问\",\"parseId\":79,\"city\":\"厦门,深圳,东莞,海口\"},\n" +
                "{\"phone\":\"魏航-18817576804\",\"title\":\"消防站驾驶员\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"魏航-18817576804\",\"title\":\"安保监控中心专员\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"魏航-18817576804\",\"title\":\"安保队员\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Cici-15210189776\",\"title\":\"物流班长\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"魏航-18817576804\",\"title\":\"电池质量检验员\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"魏航-18817576804\",\"title\":\"整车质量检验员\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"魏航-18817576804\",\"title\":\"电池实验室技师\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"魏航-18817576804\",\"title\":\"三坐标测量技师\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"魏航-18817576804\",\"title\":\"设施消防技术员\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"魏航-18817576804\",\"title\":\"设施水处理技术员\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"魏航-18817576804\",\"title\":\"设施电气技术员\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"魏航-18817576804\",\"title\":\"设施土建技术员\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"魏航-18817576804\",\"title\":\"设施机械技术员\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Cici-15210189776\",\"title\":\"动力设备维修技师\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Cici-15210189776\",\"title\":\"动力设备维修班长\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Cici-15210189776\",\"title\":\"动力生产班长\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Cici-15210189776\",\"title\":\"总装返修技师\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Cici-15210189776\",\"title\":\"总装设备维修班长\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Cici-15210189776\",\"title\":\"总装设备维修技师\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Cici-15210189776\",\"title\":\"总装生产班长\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"魏航-18817576804\",\"title\":\"涂装生产班组长\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"魏航-18817576804\",\"title\":\"涂装设备维修技师\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"魏航-18817576804\",\"title\":\"涂装点补技师\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"魏航-18817576804\",\"title\":\"焊装超声波检测技师\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"魏航-18817576804\",\"title\":\"焊装尺寸匹配技师\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"魏航-18817576804\",\"title\":\"焊装设备维修技师\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"魏航-18817576804\",\"title\":\"冲压叉车工\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"魏航-18817576804\",\"title\":\"冲压行车工\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"魏航-18817576804\",\"title\":\"钣金返修技师\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"魏航-18817576804\",\"title\":\"冲压模具维修技师\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"魏航-18817576804\",\"title\":\"冲压模具维修班长\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"魏航-18817576804\",\"title\":\"冲压设备维修班长\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"魏航-18817576804\",\"title\":\"冲压设备维修技师\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"魏航-18817576804\",\"title\":\"压铸模具维修技师\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"魏航-18817576804\",\"title\":\"压铸模具维修班长\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"魏航-18817576804\",\"title\":\"压铸设备维修技师\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"魏航-18817576804\",\"title\":\"压铸设备维修班长\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Ronat-18117131813\",\"title\":\"焊装设备工程师\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Ronat-18117131813\",\"title\":\"焊装工艺工程师\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Ivy-18771092501\",\"title\":\"电池现场主管\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Ivy-18771092501\",\"title\":\"电池质量工程师\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"\",\"title\":\"引线键合工艺工程师\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"\",\"title\":\"压铸电气工程师\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Ivy-18771092501\",\"title\":\"压铸设备工程师\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Ivy-18771092501\",\"title\":\"压铸设备经理\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Ivy-18771092501\",\"title\":\"熔炼设备工程师\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"\",\"title\":\"PACK工艺工程师\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Ronat-18117131813\",\"title\":\"仓储物流主管\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Ronat-18117131813\",\"title\":\"制造技术项目经理\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Cathy-15251612973\",\"title\":\"总装机械工程师\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Joan-18825192583\",\"title\":\"车辆交付顾问\",\"parseId\":79,\"city\":\"厦门,深圳,东莞\"},\n" +
                "{\"phone\":\"\",\"title\":\"校园招聘项目顾问\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"David-18918373715\",\"title\":\"招聘顾问-制造\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Kim-13818925449\",\"title\":\"售后机电维修技师\",\"parseId\":79,\"city\":\"常州\"},\n" +
                "{\"phone\":\"Wendy-13522812901\",\"title\":\"资深人力资源业务伙伴\",\"parseId\":79,\"city\":\"北京\"},\n" +
                "{\"phone\":\"\",\"title\":\"GC Rewards Partner\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Yunyun-18918373736\",\"title\":\"招聘实习生-研发方向\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Susan-18516190077\",\"title\":\"Supply Chain Analyst 供应链管理工程师\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Susan-18516190077\",\"title\":\"Module/Pack Production Manager 电池生产经理\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Mika-17301832967\",\"title\":\"布线工程师\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Sarah-13524167281\",\"title\":\"业务拓展经理 -电网/发电侧\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Ronat-18117131813\",\"title\":\"电机质量经理\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"\",\"title\":\"Supply Chain Application Lead\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"\",\"title\":\"充电开发和新媒体运营专员 Mission Control Specialist\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Sunny-18751964800\",\"title\":\"目的地充电项目经理\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Joan-18825192583\",\"title\":\"产品专员-校园招聘\",\"parseId\":79,\"city\":\"全国\"},\n" +
                "{\"phone\":\"Joan-18825192583\",\"title\":\"交付体验专员-校园招聘\",\"parseId\":79,\"city\":\"全国\"},\n" +
                "{\"phone\":\"Ronat-18117131813\",\"title\":\"涂装工艺工程师\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Ivy-18771092501\",\"title\":\"电机质量工程师-定子/转子\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"\",\"title\":\"行政实习生\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Wendy-13522812901\",\"title\":\"Senior Software Engineer\",\"parseId\":79,\"city\":\"北京,上海\"},\n" +
                "{\"phone\":\"Wendy-13522812901\",\"title\":\"Senior Frontend Engineer\",\"parseId\":79,\"city\":\"北京,上海\"},\n" +
                "{\"phone\":\"\",\"title\":\"客户关系管理助理项目经理\",\"parseId\":79,\"city\":\"上海,杭州\"},\n" +
                "{\"phone\":\"Diana-18001996756\",\"title\":\"测试开发工程师\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Susan-18516190077\",\"title\":\"Supply Chain Analyst\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Ronat-18117131813\",\"title\":\"工艺工程师-焊装/车身\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Ronat-18117131813\",\"title\":\"尺寸工程师-焊装/车身\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"\",\"title\":\"Technical Program Manager, Infotainment 技术项目经理, 信息娱乐系统\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Joan-18825192583\",\"title\":\"产品销售专员，佛山禅城\",\"parseId\":79,\"city\":\"佛山\"},\n" +
                "{\"phone\":\"Wendy-13522812901\",\"title\":\"应用技术支持工程师\",\"parseId\":79,\"city\":\"北京,上海\"},\n" +
                "{\"phone\":\"Mika-17301832967\",\"title\":\"固定资产会计\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Xueli-18621704256\",\"title\":\"BMP电池设备经理\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Diana-18001996756\",\"title\":\"Executive Assistant\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Candice-15000188334\",\"title\":\"Launch Design Engineer, HV Battery Module 量产工程师，高压电池模组\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Sunny-18751964800\",\"title\":\"家庭充电项目专员 Home Charging Specialist\",\"parseId\":79,\"city\":\"深圳\"},\n" +
                "{\"phone\":\"Mika-17301832967\",\"title\":\"Network Engineer\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Wendy-13522812901\",\"title\":\"Data Center Engineer\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"陈漫瑜-18621738989\",\"title\":\"特斯拉体验店-副店长\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Sunny-18751964800\",\"title\":\"高级项目拓展经理\",\"parseId\":79,\"city\":\"北京,天津,上海,杭州,广州,深圳,成都\"},\n" +
                "{\"phone\":\"Candice-15000188334\",\"title\":\"Integration Engineer, Low Voltage Electronic Systems 集成工程师，低压电器系统\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Candice-15000188334\",\"title\":\"Integration Engineer, Sensor 集成工程师，传感器\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Sunny-18751964800\",\"title\":\"认证测试工程师\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Cici-15210189776\",\"title\":\"总装生产操作工\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"魏航-18817576804\",\"title\":\"冲压生产操作工\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"魏航-18817576804\",\"title\":\"涂装生产操作工\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"魏航-18817576804\",\"title\":\"车身生产操作工\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"魏航-18817576804\",\"title\":\"压铸生产操作工\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Cici-15210189776\",\"title\":\"动力生产操作工\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Cici-15210189776\",\"title\":\"物流叉车工\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"魏航-18817576804\",\"title\":\"过程质量检验员\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Mika-17301832967\",\"title\":\"Sr Manager, Platform and Security Engineering\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"魏航-18817576804\",\"title\":\"总装匹配技师\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Mika-17301832967\",\"title\":\"成本会计 - 临港\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"\",\"title\":\"目的地充电项目经理 Destination Assistant Program Manager\",\"parseId\":79,\"city\":\"深圳\"},\n" +
                "{\"phone\":\"Joan-18825192583\",\"title\":\"直营体验店-店长\",\"parseId\":79,\"city\":\"深圳\"},\n" +
                "{\"phone\":\"Joan-18825192583\",\"title\":\"直营体验店-店长\",\"parseId\":79,\"city\":\"厦门\"},\n" +
                "{\"phone\":\"Cathy-15251612973\",\"title\":\"物料计划员\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"\",\"title\":\"充电技术经理\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Mika-17301832967\",\"title\":\"库存控制分析（财务）Inventory Control Analyst\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Cathy-15251612973\",\"title\":\"电机转子工艺工程师\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Cathy-15251612973\",\"title\":\"电机装配工艺工程师\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Candice-15000188334\",\"title\":\"Integration Engineer, Low Voltage Electronic Systems 集成工程师，低压电器系统 - 校园招聘\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"\",\"title\":\"Design & Engineering Intern\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Yunyun-18918373736\",\"title\":\"HRBP Intern\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"\",\"title\":\"行政部门实习生\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Diana-18001996756\",\"title\":\"软件开发工程师（c# .net 上海）\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Candice-15000188334\",\"title\":\"Product Support Engineer, Infotainment System 产品支持工程师，信息娱乐系统 \",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"\",\"title\":\"压铸质量工程师\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Candice-15000188334\",\"title\":\"Product Support Engineer-Autopilot\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Candice-15000188334\",\"title\":\"Data Engineer（R&D）数据工程师\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Sunny-18751964800\",\"title\":\"厂务运维-消防工程师\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Sunny-18751964800\",\"title\":\"厂务运维-暖通机械工程师\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Joan-18825192583\",\"title\":\"交付体验专员\",\"parseId\":79,\"city\":\"厦门,深圳,东莞\"},\n" +
                "{\"phone\":\"Candice-15000188334\",\"title\":\"EMC Validation Test Engineer\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"\",\"title\":\"行政助理兼前台\",\"parseId\":79,\"city\":\"北京\"},\n" +
                "{\"phone\":\"Joan-18825192583\",\"title\":\"交付体验专员，广州/长沙/南昌/南宁\",\"parseId\":79,\"city\":\"南昌,长沙,广州,南宁\"},\n" +
                "{\"phone\":\"\",\"title\":\"交付支持-北京亦庄\",\"parseId\":79,\"city\":\"北京\"},\n" +
                "{\"phone\":\"\",\"title\":\"高级项目拓展专员/经理\",\"parseId\":79,\"city\":\"北京,天津,上海,杭州,广州,深圳,成都\"},\n" +
                "{\"phone\":\"Sarah-13524167281\",\"title\":\"特斯拉直营-售后服务经理-上海\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Sunny-18751964800\",\"title\":\"公关经理，上海临港\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Yunyun-18918373736\",\"title\":\"Government Relations Intern\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"\",\"title\":\"Project Control Intern工程控制实习生\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"王嘉玮-18810366045\",\"title\":\"金融服务运营顾问\",\"parseId\":79,\"city\":\"北京\"},\n" +
                "{\"phone\":\"Sarah-13524167281\",\"title\":\"特斯拉直营 - 服务助理 \",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Diana-18001996756\",\"title\":\"IT 技术项目经理( HR)\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Ronat-18117131813\",\"title\":\"总装生产主管\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"\",\"title\":\"行政运营助理\",\"parseId\":79,\"city\":\"北京\"},\n" +
                "{\"phone\":\"Candice-15000188334\",\"title\":\"Software Engineer-Navigation\",\"parseId\":79,\"city\":\"北京,上海\"},\n" +
                "{\"phone\":\"Joan-18825192583\",\"title\":\"产品销售专家\",\"parseId\":79,\"city\":\"海口\"},\n" +
                "{\"phone\":\"Sarah-13524167281\",\"title\":\"特斯拉直营- 汽车钣金技师-虹桥\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"\",\"title\":\"高级运维开发工程师\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"\",\"title\":\"资深人力资源业务伙伴\",\"parseId\":79,\"city\":\"成都\"},\n" +
                "{\"phone\":\"Sarah-13524167281\",\"title\":\"特斯拉直营-配件顾问 -华翔服务中心\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Joan-18825192583\",\"title\":\"产品销售专员，南昌/长沙\",\"parseId\":79,\"city\":\"南昌,长沙\"},\n" +
                "{\"phone\":\"Joan-18825192583\",\"title\":\"交付运营专员\",\"parseId\":79,\"city\":\"东莞\"},\n" +
                "{\"phone\":\"\",\"title\":\"交付体验专员\",\"parseId\":79,\"city\":\"北京,青岛\"},\n" +
                "{\"phone\":\"魏航-18817576804\",\"title\":\"压铸X射线检验员(RT)\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"\",\"title\":\"交付体验专员\",\"parseId\":79,\"city\":\"郑州,重庆,成都,西安\"},\n" +
                "{\"phone\":\"Sunny-18751964800\",\"title\":\"充电运营项目经理 China Charging Operational Program Manager\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"\",\"title\":\"Internal Audit Intern, Shanghai\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Sarah-13524167281\",\"title\":\"直营店店长\",\"parseId\":79,\"city\":\"温州\"},\n" +
                "{\"phone\":\"陈漫瑜-18621738989\",\"title\":\"直营店店长\",\"parseId\":79,\"city\":\"常州\"},\n" +
                "{\"phone\":\"王嘉玮-18810366045\",\"title\":\"直营店店长\",\"parseId\":79,\"city\":\"天津,沈阳,郑州\"},\n" +
                "{\"phone\":\"陈漫瑜-18621738989\",\"title\":\"直营店副店长\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Vera-13795309703\",\"title\":\"销售运营分析师(资深)\",\"parseId\":79,\"city\":\"北京\"},\n" +
                "{\"phone\":\"Candice-15000188334\",\"title\":\"Software Engineer, Backend\",\"parseId\":79,\"city\":\"北京,上海\"},\n" +
                "{\"phone\":\"Kim-13818925449\",\"title\":\"交付体验专员\",\"parseId\":79,\"city\":\"常州,杭州\"},\n" +
                "{\"phone\":\"\",\"title\":\"服务品质保证经理\",\"parseId\":79,\"city\":\"北京,上海\"},\n" +
                "{\"phone\":\"陈漫瑜-18621738989\",\"title\":\"产品销售专家\",\"parseId\":79,\"city\":\"常州\"},\n" +
                "{\"phone\":\"Sarah-13524167281\",\"title\":\"交付体验专员\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Troy-13917747423\",\"title\":\"安保主管 SOC Supervisor - 临港超级工厂\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Candice-15000188334\",\"title\":\"Thermal Engineer, Electronics 热能工程师，电子元器件\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Candice-15000188334\",\"title\":\"Mechanical Engineer, Autopilot Hardwares 机械工程师，Autopilot硬件\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Candice-15000188334\",\"title\":\"Mechanical Engineer, Infotainment Hardwares 机械工程师，信息娱乐系统硬件\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Vera-13795309703\",\"title\":\"直营店店长\",\"parseId\":79,\"city\":\"上海,成都\"},\n" +
                "{\"phone\":\"Sarah-13524167281\",\"title\":\"特斯拉直营- 汽车钣金喷漆技师 -虹桥Bodyshop\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"\",\"title\":\"Mechanical Engineer - Low Voltage Test\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Mika-17301832967\",\"title\":\"NOC工程师 - 临港\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Ronat-18117131813\",\"title\":\"自动化控制经理-Core Automation Engineering\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"\",\"title\":\"资深自动化控制工程师\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"魏航-18817576804\",\"title\":\"质量检验班长\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Wendy-13522812901\",\"title\":\"高级系统工程师\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Troy-13917747423\",\"title\":\"动力设计工程师\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"\",\"title\":\"售后服务助理实习生\",\"parseId\":79,\"city\":\"苏州\"},\n" +
                "{\"phone\":\"\",\"title\":\"高级控制工程师\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"\",\"title\":\"Senior Automation Controls Engineer -高级自动化控制工程师\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"\",\"title\":\"测试职位\",\"parseId\":79,\"city\":\"无锡,江阴\"},\n" +
                "{\"phone\":\"Candice-15000188334\",\"title\":\"Test Engineer - Electrical, Electronics System 测试工程师 – 电子系统，电器方向\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Candice-15000188334\",\"title\":\"Test Engineer - Mechanical, Electronics System 测试工程师 – 电子系统，机械方向 \",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"魏航-18817576804\",\"title\":\"计量校准技师\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"张晓桐-15821496102\",\"title\":\"Product Specialist 产品销售专家\",\"parseId\":79,\"city\":\"南京\"},\n" +
                "{\"phone\":\"张晓桐-15821496102\",\"title\":\"Product Specialist 产品销售专家\",\"parseId\":79,\"city\":\"杭州\"},\n" +
                "{\"phone\":\"陈漫瑜-18621738989\",\"title\":\"产品销售专家\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Candice-15000188334\",\"title\":\"Materials Engineer, Metallic Materials 材料工程师，金属材料\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Candice-15000188334\",\"title\":\"高级失效分析工程师, PCBA\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"魏航-18817576804\",\"title\":\"进料检验员\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Mika-17301832967\",\"title\":\"IT事故响应主管 Incident Supervisor - 临港\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Mika-17301832967\",\"title\":\"（高级）IT生产支持工程师\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Ivy-18771092501\",\"title\":\"压铸模具维修主管\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Mika-17301832967\",\"title\":\"高级网络工程师\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Ivy-18771092501\",\"title\":\"质量工艺工程师\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Ivy-18771092501\",\"title\":\"压铸模具工程师\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Susan-18516190077\",\"title\":\"电池生产工段长\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Candice-15000188334\",\"title\":\"Material Engineer, Paint & Polymers 材料工程师，油漆 & 高分子原材料\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Ronat-18117131813\",\"title\":\"总装设备主管\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Joan-18825192583\",\"title\":\"产品销售专家\",\"parseId\":79,\"city\":\"福州\"},\n" +
                "{\"phone\":\"Ronat-18117131813\",\"title\":\"焊装生产主管\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"\",\"title\":\"人力资源总监(HRD)\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Sarah-13524167281\",\"title\":\"特斯拉直营 -售后服务助理- 宝山\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Sunny-18751964800\",\"title\":\"商务拓展经理\",\"parseId\":79,\"city\":\"广州,深圳\"},\n" +
                "{\"phone\":\"Cathy-15251612973\",\"title\":\"逆变器工艺工程师\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Ronat-18117131813\",\"title\":\"逆变器设备工程师\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Joan-18825192583\",\"title\":\"特斯拉直营-售后服务副经理\",\"parseId\":79,\"city\":\"海口\"},\n" +
                "{\"phone\":\"魏航-18817576804\",\"title\":\"焊装返修技师\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Ronat-18117131813\",\"title\":\"电控生产技术经理\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Ronat-18117131813\",\"title\":\"电控生产经理\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Sarah-13524167281\",\"title\":\"特斯拉直营 - PDI 检查技师\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Diana-18001996756\",\"title\":\"高级软件开发工程师（c#/.net)\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Joan-18825192583\",\"title\":\"售后服务顾问 Service Advisor\",\"parseId\":79,\"city\":\"深圳\"},\n" +
                "{\"phone\":\"Ivy-18771092501\",\"title\":\"压铸工艺经理\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Susan-18516190077\",\"title\":\"门店工程项目经理\",\"parseId\":79,\"city\":\"北京,上海,广州,深圳\"},\n" +
                "{\"phone\":\"Diana-18001996756\",\"title\":\" Sr. Software Engineer（Full Stack，C# .netcore+Angular）\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Cici-15210189776\",\"title\":\"电气设备维修技师-DU电机车间\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Cici-15210189776\",\"title\":\"机械设备维修技师-DU电机车间\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Cici-15210189776\",\"title\":\"设备维修班长-DU电机车间\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Candice-15000188334\",\"title\":\"Materials Test Engineer 材料测试工程师，金属件原材料\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Candice-15000188334\",\"title\":\"Materials Test Technician 材料测试技师\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Candice-15000188334\",\"title\":\"Software Engineer, Map and Navigation (frontend) 软件工程师，地图导航（前端开发）\",\"parseId\":79,\"city\":\"北京,上海\"},\n" +
                "{\"phone\":\"Candice-15000188334\",\"title\":\"Software Engineer, Site Reliability Engineer 软件工程师，SRE\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Xueli-18621704256\",\"title\":\"电池设备工段长\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Xueli-18621704256\",\"title\":\"电池设备经理\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Kim-13818925449\",\"title\":\"售后机电维修技师\",\"parseId\":79,\"city\":\"宁波,温州,台州\"},\n" +
                "{\"phone\":\"Diana-18001996756\",\"title\":\"数据开发工程师\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Sarah-13524167281\",\"title\":\"特斯拉直营 -维修技师 -杨浦创智汇\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Sarah-13524167281\",\"title\":\"特斯拉直营 -服务顾问 -虹桥\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Wendy-13522812901\",\"title\":\"Senior DevOps Engineer\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Candice-15000188334\",\"title\":\"Engineering Intern, Software\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Candice-15000188334\",\"title\":\"Intern, Mobile App Software Engineering\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"David-18918373715\",\"title\":\"质量高级经理 Sr. Quality Manager\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Kim-13818925449\",\"title\":\"售后配件协调专员\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"魏航-18817576804\",\"title\":\"电机车间工艺技师-转子产线\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"魏航-18817576804\",\"title\":\"电机车间工艺技师-定子产线\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Ronat-18117131813\",\"title\":\"生产计划及控制经理\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Diana-18001996756\",\"title\":\"全栈开发工程师\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Sarah-13524167281\",\"title\":\"客户交付体验专员-实习生 （上海虹桥，金桥）\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Mika-17301832967\",\"title\":\"(Sr.) HR Partner - 临港\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Ronat-18117131813\",\"title\":\"堆场管理专员\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Cathy-15251612973\",\"title\":\"压铸控制工程师\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Sunny-18751964800\",\"title\":\"厂务运维-能源管理工程师\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Sunny-18751964800\",\"title\":\"Closure Engineer 开闭件工程师\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"\",\"title\":\"Intern, Product Engineering \",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"\",\"title\":\"交付体验实习生\",\"parseId\":79,\"city\":\"上海,重庆,成都\"},\n" +
                "{\"phone\":\"Yunyun-18918373736\",\"title\":\"新媒体运营实习生\",\"parseId\":79,\"city\":\"成都\"},\n" +
                "{\"phone\":\"Yunyun-18918373736\",\"title\":\"新媒体运营实习生\",\"parseId\":79,\"city\":\"北京\"},\n" +
                "{\"phone\":\"张晓桐-15821496102\",\"title\":\"Owner Advisor销售主管\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Sarah-13524167281\",\"title\":\"维修技师  -上海宝山\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Sarah-13524167281\",\"title\":\"维修技师 - 上海金穗\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"魏航-18817576804\",\"title\":\"质量评审技师\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Troy-13917747423\",\"title\":\"门禁专员 Access Specialist\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Yunyun-18918373736\",\"title\":\"新媒体运营实习生\",\"parseId\":79,\"city\":\"北京,上海\"},\n" +
                "{\"phone\":\"\",\"title\":\"出场物流协调员\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"魏航-18817576804\",\"title\":\"压铸生产班长\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Mika-17301832967\",\"title\":\"网络监控工程师 - 临港\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Candice-15000188334\",\"title\":\"Optical Engineer, Autopilot Products\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"魏航-18817576804\",\"title\":\"供应商质量检验员\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"魏航-18817576804\",\"title\":\"压铸材料分析技师\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"魏航-18817576804\",\"title\":\"冲压压铸质量检验班长\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"\",\"title\":\"项目经理-售后服务收入成本运营\",\"parseId\":79,\"city\":\"北京\"},\n" +
                "{\"phone\":\"\",\"title\":\"区域业务发展项目经理\",\"parseId\":79,\"city\":\"北京\"},\n" +
                "{\"phone\":\"\",\"title\":\"产品销售专家\",\"parseId\":79,\"city\":\"成都\"},\n" +
                "{\"phone\":\"Joan-18825192583\",\"title\":\"Recruiter招聘顾问\",\"parseId\":79,\"city\":\"深圳\"},\n" +
                "{\"phone\":\"Joan-18825192583\",\"title\":\"产品销售专家\",\"parseId\":79,\"city\":\"东莞\"},\n" +
                "{\"phone\":\"Susan-18516190077\",\"title\":\"工程费用控制工程师\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Susan-18516190077\",\"title\":\"项目维修经理（零售店铺）\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Sunny-18751964800\",\"title\":\"高级商务拓展项目经理\",\"parseId\":79,\"city\":\"武汉\"},\n" +
                "{\"phone\":\"\",\"title\":\"电商专员\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Joan-18825192583\",\"title\":\"特斯拉直营-售后维修技师\",\"parseId\":79,\"city\":\"东莞\"},\n" +
                "{\"phone\":\"Sunny-18751964800\",\"title\":\"Sr. Passive Safety Test Engineer\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Ivy-18771092501\",\"title\":\"生产一致性工程师\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"袁万莉-17701769188\",\"title\":\"CRM专员，系统数据方向\",\"parseId\":79,\"city\":\"北京\"},\n" +
                "{\"phone\":\"\",\"title\":\"Internal Audit Intern\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"魏航-18817576804\",\"title\":\"冲压压铸质量检验员\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"魏航-18817576804\",\"title\":\"车身生产班长\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"魏航-18817576804\",\"title\":\"设施自动控制技术员\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Wendy-13522812901\",\"title\":\"人力资源\",\"parseId\":79,\"city\":\"成都\"},\n" +
                "{\"phone\":\"Mika-17301832967\",\"title\":\"IT Support Technician, helpdesk, 临港\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Wendy-13522812901\",\"title\":\"Financial Services Technical Project Manager\",\"parseId\":79,\"city\":\"北京,上海\"},\n" +
                "{\"phone\":\"Ivy-18771092501\",\"title\":\"质量工程师-底盘\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"张晓桐-15821496102\",\"title\":\"产品销售专家-临港超级工厂鸿音店\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Sarah-13524167281\",\"title\":\"特斯拉直营- 维修技师 -金桥\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Mika-17301832967\",\"title\":\"Talent Development Partner, 临港\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Mika-17301832967\",\"title\":\"HR Specialist - 临港\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Vera-13795309703\",\"title\":\"商业运营项目经理\",\"parseId\":79,\"city\":\"北京\"},\n" +
                "{\"phone\":\"Vera-13795309703\",\"title\":\"官方平台运营专员\",\"parseId\":79,\"city\":\"北京\"},\n" +
                "{\"phone\":\"张晓桐-15821496102\",\"title\":\"产品销售专家杭州站-6月19日\",\"parseId\":79,\"city\":\"杭州\"},\n" +
                "{\"phone\":\"袁万莉-17701769188\",\"title\":\"CRM 专员，新媒体\",\"parseId\":79,\"city\":\"北京,上海\"},\n" +
                "{\"phone\":\"\",\"title\":\"EHS Intern\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Sunny-18751964800\",\"title\":\"高级认证测试工程师\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Kim-13818925449\",\"title\":\"新产品导入专员（临港）\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Kim-13818925449\",\"title\":\"工具管理项目经理（临港）\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Sarah-13524167281\",\"title\":\"特斯拉直营-服务助理 -华翔（近虹桥）\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Ronat-18117131813\",\"title\":\"涂装控制工程师\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Candice-15000188334\",\"title\":\"区域对外事务经理\",\"parseId\":79,\"city\":\"全国\"},\n" +
                "{\"phone\":\"Sarah-13524167281\",\"title\":\"特斯拉直营-售后服务经理-江苏\",\"parseId\":79,\"city\":\"常州\"},\n" +
                "{\"phone\":\"Diana-18001996756\",\"title\":\"法律顾问，诉讼\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"王嘉玮-18810366045\",\"title\":\"特斯拉-产品销售专家-储备人才\",\"parseId\":79,\"city\":\"北京,沈阳,青岛,成都\"},\n" +
                "{\"phone\":\"魏航-18817576804\",\"title\":\"压铸工艺员\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"\",\"title\":\"区域市场专员\",\"parseId\":79,\"city\":\"北京,上海,南京,杭州,厦门,武汉,长沙,广州,深圳,重庆\"},\n" +
                "{\"phone\":\"陈漫瑜-18621738989\",\"title\":\"特斯拉-产品销售专家-上海 (浦西门店）\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"袁万莉-17701769188\",\"title\":\"CRM专员，活动策划执行\",\"parseId\":79,\"city\":\"北京,上海\"},\n" +
                "{\"phone\":\"\",\"title\":\"市场专员-垂直平台运营管理\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Cathy-15251612973\",\"title\":\"转子压铸工艺工程师\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"袁万莉-17701769188\",\"title\":\"CRM 客户关系经理\",\"parseId\":79,\"city\":\"北京,上海\"},\n" +
                "{\"phone\":\"Diana-18001996756\",\"title\":\"Stability Engineer\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"魏航-18817576804\",\"title\":\"压铸机主操\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"魏航-18817576804\",\"title\":\"金相检验员\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"\",\"title\":\"产品专家实习生\",\"parseId\":79,\"city\":\"北京,青岛,郑州,重庆,成都,西安\"},\n" +
                "{\"phone\":\"Kim-13818925449\",\"title\":\"售后服务实习生\",\"parseId\":79,\"city\":\"上海,南京,常州,苏州,杭州,宁波\"},\n" +
                "{\"phone\":\"\",\"title\":\"服务业务发展实习生（现场实习）\",\"parseId\":79,\"city\":\"北京\"},\n" +
                "{\"phone\":\"Wendy-13522812901\",\"title\":\"Senior Java Software Engineer\",\"parseId\":79,\"city\":\"北京,上海\"},\n" +
                "{\"phone\":\"魏航-18817576804\",\"title\":\"冲压质检员\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"陈漫瑜-18621738989\",\"title\":\"特斯拉-直营店店长\",\"parseId\":79,\"city\":\"南京,无锡,常州\"},\n" +
                "{\"phone\":\"陈漫瑜-18621738989\",\"title\":\"直营店店长\",\"parseId\":79,\"city\":\"南京\"},\n" +
                "{\"phone\":\"陈漫瑜-18621738989\",\"title\":\"直营店店长\",\"parseId\":79,\"city\":\"无锡\"},\n" +
                "{\"phone\":\"\",\"title\":\"家庭充电项目经理\",\"parseId\":79,\"city\":\"杭州\"},\n" +
                "{\"phone\":\"\",\"title\":\"Recruiter 招聘顾问\",\"parseId\":79,\"city\":\"北京\"},\n" +
                "{\"phone\":\"Cathy-15251612973\",\"title\":\"New Program Material Planner\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Cathy-15251612973\",\"title\":\"Process&Data analyst\",\"parseId\":79,\"city\":\"上海\"},\n" +
                "{\"phone\":\"Cathy-15251612973\",\"title\":\"Test Engineer, Remanufacturing\",\"parseId\":79,\"city\":\"上海\"}\n" +
                "]";

        List<PositionInfo> positionInfos = JSON.parseArray(json, PositionInfo.class);

        List<RequestParam> requestParams = new ArrayList<>();
        positionInfos.forEach(e -> {
            RequestParam requestParam = new RequestParam();
            if (!"".equals(e.getPhone()) && Objects.nonNull(e.getPhone())) {
                String[] split = e.getPhone().split("-");
                e.setPhone(split[1]);
                //todo 根据手机号去查找accountId
            } else {
                requestParam.setAccountId(101767);
            }
            requestParams.add(requestParam);
        });

        positionInfos.forEach(e -> {

        });


        positionInfos.forEach(System.out::println);

    }
}
