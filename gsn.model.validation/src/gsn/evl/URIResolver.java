/*******************************************************************************
 * Copyright (c) 2008 The University of York.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Dimitrios Kolovos - initial API and implementation
 ******************************************************************************/
package gsn.evl;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class URIResolver {	
	protected static URI getFileURI(String fileName) throws URISyntaxException {
		URL url    = URIResolver.class.getResource(fileName);
		URI binUri = url.toURI();
		URI uri = null;

		if (binUri.toString().indexOf("bin") > -1) {
			uri = new URI(binUri.toString().replaceAll("bin", "src"));
		}
		else {
			uri = binUri;
		}
		
//		System.out.println(fileName);
//		System.out.println(url);
//		System.out.println(binUri);
//		System.out.println(uri);

		return uri;
	}
}