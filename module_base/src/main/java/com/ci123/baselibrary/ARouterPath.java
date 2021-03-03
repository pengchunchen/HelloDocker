package com.ci123.baselibrary;

public class ARouterPath {

    /**
     * 每个模块的入口界面路径必须注册在这边，命名规则为模块_MAIN
     * 模块内的其他界面可以选择卸载这，也可以写在模块内部（暂定）
     */

    public static final String MODULEA_MAIN = "/moduleA/ModuleActivity";
    public static final String MODULEB_MAIN = "/moduleB/ModuleBMainActivity";
    public static final String MODULEC_MAIN = "/moduleC/ModuleActivity";
}
