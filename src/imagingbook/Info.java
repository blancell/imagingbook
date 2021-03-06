/*******************************************************************************
 This software is provided as a supplement to the authors' textbooks on digital
 image processing published by Springer-Verlag in various languages and editions.
 Permission to use and distribute this software is granted under the BSD 2-Clause 
 "Simplified" License (see http://opensource.org/licenses/BSD-2-Clause). 
 Copyright (c) 2006-2013 Wilhelm Burger, Mark J. Burge. 
 All rights reserved. Visit http://www.imagingbook.com for additional details.
 ******************************************************************************/

package imagingbook;

public class Info {
	
	private static int VERSION = 20130623;
	
	/**
	 * @return The current version of the 'imagingbook' library as an 8-digit integer,
	 * e.g. 20130721 (YYYYMMDD).
	 */
	public static int getVersion() {
		return VERSION;
	}

}
