package md528b647cdf343cd525e83b31df234f8bd;


public class ExtendedMasterDetailRenderer
	extends md51558244f76c53b6aeda52c8a337f2c37.MasterDetailRenderer
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("XLabs.Forms.Pages.ExtendedMasterDetailRenderer, XLabs.Forms.Droid", ExtendedMasterDetailRenderer.class, __md_methods);
	}


	public ExtendedMasterDetailRenderer (android.content.Context p0)
	{
		super (p0);
		if (getClass () == ExtendedMasterDetailRenderer.class)
			mono.android.TypeManager.Activate ("XLabs.Forms.Pages.ExtendedMasterDetailRenderer, XLabs.Forms.Droid", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public ExtendedMasterDetailRenderer (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == ExtendedMasterDetailRenderer.class)
			mono.android.TypeManager.Activate ("XLabs.Forms.Pages.ExtendedMasterDetailRenderer, XLabs.Forms.Droid", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public ExtendedMasterDetailRenderer (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == ExtendedMasterDetailRenderer.class)
			mono.android.TypeManager.Activate ("XLabs.Forms.Pages.ExtendedMasterDetailRenderer, XLabs.Forms.Droid", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
	}

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
