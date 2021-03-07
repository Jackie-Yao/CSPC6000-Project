package Project;

public class ActionItemIterator implements Iterator{
	
	ActionItem[] ActionItems;
	int position = 0;

	public ActionItemIterator(ActionItem[] items) {
		this.ActionItems = items;
	}
	
	@Override
	public boolean hasNext() {
		if(position >= ActionItems.length || ActionItems[position] == null) {
			return false;
		}else {
			return true;
		}
	}

	@Override
	public Object next() {
		ActionItem actionitem = ActionItems[position];
		position += 1;
		return actionitem;
	}

}


