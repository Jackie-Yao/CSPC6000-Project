package Project;

import static org.junit.Assert.*;

import org.junit.Test;

public class IteratorPatternJunitTest {

	@Test
	public void test() {
		ActionItemList actionitems = new ActionItemList(8,10, 4, 20);
		ActionItemIterator iter = actionitems.CreateIterator();
		
		while(iter.hasNext()) {
			ActionItem item =  (ActionItem)iter.next();
			item.PrettyPrintAction();
		}
	}

}
