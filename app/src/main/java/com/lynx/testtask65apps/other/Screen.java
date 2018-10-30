package com.lynx.testtask65apps.other;

import android.os.Bundle;

import com.arellomobile.mvp.MvpAppCompatFragment;
import com.lynx.testtask65apps.presentation.spec.SpecialityFragment;
import com.lynx.testtask65apps.presentation.workers.WorkersFragment;

public enum Screen {
    SPEC,
    WORKERS;

    public MvpAppCompatFragment create(Bundle data) {
        switch (this) {
            case SPEC:
                return SpecialityFragment.newInstance(data);
            case WORKERS:
                return WorkersFragment.newInstance(data);
            default:
                return null;
        }
    }
}
