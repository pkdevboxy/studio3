/**
 * Aptana Studio
 * Copyright (c) 2005-2011 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the GNU Public License (GPL) v3 (with exceptions).
 * Please see the license.html included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */
package com.aptana.editor.html.contentassist.model;

import java.util.EnumSet;
import java.util.Set;

import com.aptana.index.core.ui.views.IPropertyInformation;

/**
 * CSSReference
 */
public class JSReference extends BaseElement<JSReference.Property>
{
	enum Property implements IPropertyInformation<JSReference>
	{
		NAME(Messages.JSReference_NameLabel)
		{
			public Object getPropertyValue(JSReference node)
			{
				return node.getName();
			}
		},
		PATH(Messages.JSReference_PathLabel)
		{
			public Object getPropertyValue(JSReference node)
			{
				return node.getPath();
			}
		};

		private String header;
		private String category;

		private Property(String header) // $codepro.audit.disable unusedMethod
		{
			this.header = header;
		}

		private Property(String header, String category)
		{
			this.category = category;
		}

		public String getCategory()
		{
			return category;
		}

		public String getHeader()
		{
			return header;
		}
	}

	private String path;

	public JSReference(String shortName, String path)
	{
		setName(shortName);
		this.path = path;
	}

	public String getPath()
	{
		return path;
	}

	@Override
	protected Set<Property> getPropertyInfoSet()
	{
		return EnumSet.allOf(Property.class);
	}
}
