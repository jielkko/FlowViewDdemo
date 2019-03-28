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
