package cn.edu.hqu.javaee;

public class BraveKnight implements Knight {

	private Quest quest;
	private Minstrel minstrel;
	
	public BraveKnight(Quest quest,Minstrel minstrel) {
		this.quest=quest;
		this.minstrel=minstrel;
	}
	@Override
	public void embarkOnQuest() {
		// TODO Auto-generated method stub
		minstrel.singBeforeQuest();
		quest.embark();
		minstrel.singAfterQuest();
	}
}
