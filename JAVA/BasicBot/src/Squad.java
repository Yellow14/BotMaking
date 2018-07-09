import java.util.ArrayList;
import java.util.List;

import bwapi.Unit;

/**
 * 분대를 관리하는 데이터 자료구조
 * @author wshan
 *
 */
public class Squad {

	private String name;		// 분대명
	private String order;			// 수행명령
	private List<Unit> unitSet = new ArrayList<>();	// 분대원 유닛

	public Squad(String name, String order) {
		this.name = name;
		this.order = order;
	}
	
	public String getName() {
		return name;
	}
	
	public String getOrder() {
		return order;
	}
	
	public void setOrder(String order) {
		this.order = order;
	}

	public List<Unit> getUnitSet() {
		return unitSet;
	}
	
	public void addUnit(Unit unit) {
		unitSet.add(unit);
	}
}