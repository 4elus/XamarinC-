package md5951f1daac8310ab4f79f2797fa8f9e85;


public class MonthView
	extends android.widget.LinearLayout
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onMeasure:(II)V:GetOnMeasure_IIHandler\n" +
			"n_onFinishInflate:()V:GetOnFinishInflateHandler\n" +
			"";
		mono.android.Runtime.register ("XLabs.Forms.Controls.MonoDroid.TimesSquare.MonthView, XLabs.Forms.Droid", MonthView.class, __md_methods);
	}


	public MonthView (android.content.Context p0)
	{
		super (p0);
		if (getClass () == MonthView.class)
			mono.android.TypeManager.Activate ("XLabs.Forms.Controls.MonoDroid.TimesSquare.MonthView, XLabs.Forms.Droid", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public MonthView (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == MonthView.class)
			mono.android.TypeManager.Activate ("XLabs.Forms.Controls.MonoDroid.TimesSquare.MonthView, XLabs.Forms.Droid", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public MonthView (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == MonthView.class)
			mono.android.TypeManager.Activate ("XLabs.Forms.Controls.MonoDroid.TimesSquare.MonthView, XLabs.Forms.Droid", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public MonthView (android.content.Context p0, android.util.AttributeSet p1, int p2, int p3)
	{
		super (p0, p1, p2, p3);
		if (getClass () == MonthView.class)
			mono.android.TypeManager.Activate ("XLabs.Forms.Controls.MonoDroid.TimesSquare.MonthView, XLabs.Forms.Droid", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2, p3 });
	}


	public void onMeasure (int p0, int p1)
	{
		n_onMeasure (p0, p1);
	}

	private native void n_onMeasure (int p0, int p1);


	public void onFinishInflate ()
	{
		n_onFinishInflate ();
	}

	private native void n_onFinishInflate ();

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
