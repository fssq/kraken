/*
 * Copyright 2010 NCHOVY
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.krakenapps.util;

public class StringBuilderWithSep {
	private StringBuilder sb = new StringBuilder();
	private String separater;

	public StringBuilderWithSep(String sep) {
		this.separater = sep;
	}

	public StringBuilderWithSep append(Object s) {
		if (sb.length() != 0) {
			sb.append(separater);
		}
		sb.append(s.toString());
		return this;
	}

	public StringBuilderWithSep append(Object... args) {
		for (Object s : args) {
			append(s);
		}
		return this;
	}

	public String toString() {
		return sb.toString();
	}
}
