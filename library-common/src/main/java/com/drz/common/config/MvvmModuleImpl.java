package com.drz.common.config;


import com.silion.slibrary.global.BaseApplication;
import com.silion.slibrary.module.BaseModuleImpl;

/**
 * 通过反射该类实现对组件的调用
 * {@link com.silion.slibrary.module.ModuleManager}
 */
public class MvvmModuleImpl extends BaseModuleImpl {


    private MvvmModuleImpl() {

    }

    @Override
    public void onInitFirst(BaseApplication application) {
        ModuleLifecycleConfig.getInstance().initModuleAhead(getApplication());
    }
}
