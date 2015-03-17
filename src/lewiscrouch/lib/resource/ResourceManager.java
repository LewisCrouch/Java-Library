package lewiscrouch.lib.resource;

import java.io.File;

public class ResourceManager
{
	public static final String RESOURCE_DIR = "resources/";

	public static File getResourceFile(String filename)
	{
		return new File(ResourceManager.getResourcePath(filename));
	}

	public static String getResourcePath(String filename)
	{
		File dir = new File(ResourceManager.RESOURCE_DIR);
		if(!dir.exists()) dir.mkdir();
		return ResourceManager.RESOURCE_DIR + filename;
	}
}
