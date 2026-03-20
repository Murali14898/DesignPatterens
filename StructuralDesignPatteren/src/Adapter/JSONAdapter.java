package Adapter;

public class JSONAdapter implements DataConverter{
	

	@Override
	public void convertingData() {
		JSONData jd = new JSONData();
		jd.convertXmlDataToJSONData();
		
	}

	@Override
	public void formatData() {
		
		JSONData jd = new JSONData();
		jd.formatXmlDataToJSONData();
		
	}

}
