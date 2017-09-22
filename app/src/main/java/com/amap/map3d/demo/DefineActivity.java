package com.amap.map3d.demo;

import android.app.Activity;
import android.os.Bundle;

import com.amap.api.maps.AMap;
import com.amap.api.maps.MapView;

/**
 * Created by fcy on 2017/8/18.
 */

public class DefineActivity extends Activity {
    private MapView mapview;
    private AMap map;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_define);
        mapview=(MapView)findViewById(R.id.map);
        map=mapview.getMap();
        map.setCustomMapStylePath("D:\\AndroidStudioProjects\\3DDefineDemo\\app\\src\\main\\java\\assets\\mystyle_sdk_1503020441_0100.data");
        map.setMapCustomEnable(true);

    }
}
