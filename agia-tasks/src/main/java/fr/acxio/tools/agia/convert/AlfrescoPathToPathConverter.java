package fr.acxio.tools.agia.convert;

/*
 * Copyright 2014 Acxio
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
 
import java.util.Collections;
import java.util.List;

import org.alfresco.webservice.util.ISO9075;

public class AlfrescoPathToPathConverter implements FormatConverter {

	private static final String PREFIX_REGEX = "[^/:]+:";

	@Override
	public List<String> convert(String sSource) throws ConversionException {
		return Collections.singletonList(ISO9075.decode(sSource.replaceAll(PREFIX_REGEX, "")));
	}

}
