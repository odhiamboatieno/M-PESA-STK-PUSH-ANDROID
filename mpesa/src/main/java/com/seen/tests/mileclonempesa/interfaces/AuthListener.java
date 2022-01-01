package com.seen.tests.mileclonempesa.interfaces;

import com.seen.tests.mileclonempesa.Mpesa;
import com.seen.tests.mileclonempesa.utils.Pair;

/**
 * Created by miles on 18/11/2017.
 */

public interface AuthListener {
    public void onAuthError(Pair<Integer, String> result);
    public void onAuthSuccess();
}
