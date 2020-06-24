package com.lr.spring.bean;

/**
 * @author liurui
 * @date 2020/6/24 5:03 下午
 */
public class BraveKnight implements Knight {

    private final Quest quest;

    public BraveKnight(Quest quest) {
        this.quest = quest;
    }


    @Override
    public void embarkOnQuest() {
        quest.embark();
    }
}
