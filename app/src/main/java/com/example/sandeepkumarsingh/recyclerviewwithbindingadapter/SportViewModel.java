package com.example.sandeepkumarsingh.recyclerviewwithbindingadapter;

import android.databinding.ObservableInt;

import java.util.Observable;

/**
 * Created by sandeepkumarsingh on 2/18/18.
 */

public class SportViewModel {
    public String sportName;
    public final ObservableInt imgSrcId = new ObservableInt();
}
