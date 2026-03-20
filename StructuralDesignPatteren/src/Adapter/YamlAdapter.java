package Adapter;

public class YamlAdapter implements DataConverter{

	@Override
	public void convertingData() {
		YamlData yd = new YamlData();
		yd.convertYamlDataToJSONData();
		
	}

	@Override
	public void formatData() {

		YamlData yd = new YamlData();
		yd.formatYamlDataToJSONData();
		
	}

}
