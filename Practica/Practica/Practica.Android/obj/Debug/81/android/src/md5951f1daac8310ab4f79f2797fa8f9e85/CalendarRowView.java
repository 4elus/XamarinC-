package md5951f1daac8310ab4f79f2797fa8f9e85;


public class CalendarRowView
	extends android.view.ViewGroup
	implements
		mono.android.IGCUserPeer,
		android.view.View.OnClickListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_addView:(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V:GetAddView_Landroid_view_View_ILandroid_view_ViewGroup_LayoutParams_Handler\n" +
			"n_onMeasure:(II)V:GetOnMeasure_IIHandler\n" +
			"n_onLayout:(ZIIII)V:GetOnLayout_ZIIIIHandler\n" +
			"n_onClick:(Landroid/view/View;)V:GetOnClick_Landroid_view_View_Handler:Android.Views.View/IOnClickListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("XLabs.Forms.Controls.MonoDroid.TimesSquare.CalendarRowView, XLabs.Forms.Droid", CalendarRowView.class, __md_methods);
	}


	public CalendarRowView (android.content.Context p0)
	{
		super (p0);
		if (getClass () == CalendarRowView.class)
			mono.android.TypeManager.Activate ("XLabs.Forms.Controls.MonoDroid.TimesSquare.CalendarRowView, XLabs.Forms.Droid", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public CalendarRowView (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == CalendarRowView.class)
			mono.android.TypeManager.Activate ("XLabs.Forms.Controls.MonoDroid.TimesSquare.CalendarRowView, XLabs.Forms.Droid", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public CalendarRowView (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == CalendarRowView.class)
			mono.android.TypeManager.Activate ("XLabs.Forms.Controls.MonoDroid.TimesSquare.CalendarRowView, XLabs.Forms.Droid", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public CalendarRowView (android.content.Context p0, android.util.AttributeSet p1, int p2, int p3)
	{
		super (p0, p1, p2, p3);
		if (getClass () == CalendarRowView.class)
			mono.android.TypeManager.Activate ("XLabs.Forms.Controls.MonoDroid.TimesSquare.CalendarRowView, XLabs.Forms.Droid", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2, p3 });
	}


	public void addView (android.view.View p0, int p1, android.view.ViewGroup.LayoutParams p2)
	{
		n_addView (p0, p1, p2);
	}

	private native void n_addView (android.view.View p0, int p1, android.view.ViewGroup.LayoutParams p2);


	public void onMeasure (int p0, int p1)
	{
		n_onMeasure (p0, p1);
	}

	private native void n_onMeasure (int p0, int p1);


	public void onLayout (boolean p0, int p1, int p2, int p3, int p4)
	{
		n_onLayout (p0, p1, p2, p3, p4);
	}

	private native void n_onLayout (boolean p0, int p1, int p2, int p3, int p4);


	public void onClick (android.view.View p0)
	{
		n_onClick (p0);
	}

	private native void n_onClick (android.view.View p0);

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
