
    <TextView
        android:layout_width="match_parent"
        android:layout_height="40dp"
        android:background="#eeeeee"
        android:gravity="center"
        android:text="热门标签"/>


    <com.hjl.taglibrary.view.HotTagLIstView
        android:id="@+id/taglist"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        />


    <TextView
        android:layout_width="match_parent"
        android:layout_height="40dp"
        android:background="#eeeeee"
        android:gravity="center"
        android:text="流程图"/>


    <com.hjl.taglibrary.view.ProcessListView
        android:id="@+id/processlist"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        />
       TagConfig.getInstance()
                .setBgColor(Color.parseColor("#eeeeee"))  //设置背景颜色
                .setLineColor(Color.parseColor("#cccccc"))//设置边框颜色
                .setTextColor(Color.parseColor("#848484"))//设置文字颜色
                .setIconColor(Color.parseColor("#cccccc"));//设置右方箭头颜色

        TagConfig.getInstance()
                .setBgColor(Color.parseColor("#ffffff"))  //设置背景颜色
                .setLineColor(Color.parseColor("#45c800"))//设置边框颜色
                .setTextColor(Color.parseColor("#45c800"))//设置文字颜色
                .setIconColor(Color.parseColor("#cccccc"));//设置右方箭头颜色


        List<TagModel> tagModelList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            tagModelList.add(new TagModel("标签" + i));
        }
        mTaglist.setTagList(tagModelList);


        List<TagModel> processList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            processList.add(new TagModel("流程" + i));
        }
        mProcesslist.setTagList(processList);
