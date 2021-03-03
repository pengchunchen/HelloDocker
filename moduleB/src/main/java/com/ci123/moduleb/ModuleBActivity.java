package com.ci123.moduleb;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.ci123.baselibrary.ARouterPath;
import com.ci123.modulea.R;

@Route(path = "/moduleB/ModuleBMainActivity")
public class ModuleBActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ARouter.getInstance().inject(this);
        setContentView(R.layout.activity_moduleb);
        findViewById(R.id.btn_b).setOnClickListener(v -> {
            ARouter.getInstance().build(ARouterPath.MODULEC_MAIN).navigation();
        });
    }
}
