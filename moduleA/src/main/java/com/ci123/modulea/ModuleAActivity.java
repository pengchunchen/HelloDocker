package com.ci123.modulea;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.ci123.baselibrary.ARouterPath;

@Route(path = "/moduleA/ModuleActivity")
public class ModuleAActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modulea);
        ARouter.getInstance().inject(this);
        findViewById(R.id.btn_a).setOnClickListener(v -> {
            ARouter.getInstance().build("/moduleA/ModuleAAActivity").navigation();
        });

        findViewById(R.id.btn_aa).setOnClickListener(v -> {
            ARouter.getInstance().build(ARouterPath.MODULEB_MAIN).navigation();
        });

    }
}
