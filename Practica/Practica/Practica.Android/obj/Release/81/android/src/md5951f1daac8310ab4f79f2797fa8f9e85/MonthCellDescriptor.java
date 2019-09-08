package md5951f1daac8310ab4f79f2797fa8f9e85;


public class MonthCellDescriptor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_toString:()Ljava/lang/String;:GetToStringHandler\n" +
			"";
		mono.android.Runtime.register ("XLabs.Forms.Controls.MonoDroid.TimesSquare.MonthCellDescriptor, XLabs.Forms.Droid", MonthCellDescriptor.class, __md_methods);
	}


	public MonthCellDescriptor ()
	{
		super ();
		if (getClass () == MonthCellDescriptor.class)
			mono.android.TypeManager.Activate ("XLabs.Forms.Controls.MonoDroid.TimesSquare.MonthCellDescriptor, XLabs.Forms.Droid", "", this, new java.lang.Object[] {  });
	}


	public java.lang.String toString ()
	{
		return n_toString ();
	}

	private native java.lang.String n_toString ();

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
