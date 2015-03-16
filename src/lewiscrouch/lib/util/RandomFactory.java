package lewiscrouch.lib.util;

import java.util.Random;

/**
 * Get an instance of Random with a seed based on System nano time.
 * @author Lewis
 *
 */
public class RandomFactory
{
	private static Random instance;

	public static Random getInstance()
	{
		if(RandomFactory.instance == null)
		{
			RandomFactory.instance = new Random(System.nanoTime());
		}

		return RandomFactory.instance;
	}
}
