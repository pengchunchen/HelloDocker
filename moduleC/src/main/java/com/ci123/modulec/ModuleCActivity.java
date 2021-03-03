package com.ci123.modulec;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.ci123.baselibrary.ARouterPath;
import com.ci123.modulea.R;

@Route(path = "/moduleC/ModuleActivity")
public class ModuleCActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modulec);
        findViewById(R.id.btn_c).setOnClickListener(v -> {
            ARouter.getInstance().build(ARouterPath.MODULEA_MAIN).navigation();
        });
    }
}
