package md5951f1daac8310ab4f79f2797fa8f9e85;


public class CalendarGridView
	extends android.view.ViewGroup
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_addView:(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V:GetAddView_Landroid_view_View_ILandroid_view_ViewGroup_LayoutParams_Handler\n" +
			"n_dispatchDraw:(Landroid/graphics/Canvas;)V:GetDispatchDraw_Landroid_graphics_Canvas_Handler\n" +
			"n_drawChild:(Landroid/graphics/Canvas;Landroid/view/View;J)Z:GetDrawChild_Landroid_graphics_Canvas_Landroid_view_View_JHandler\n" +
			"n_onMeasure:(II)V:GetOnMeasure_IIHandler\n" +
			"n_onLayout:(ZIIII)V:GetOnLayout_ZIIIIHandler\n" +
			"";
		mono.android.Runtime.register ("XLabs.Forms.Controls.MonoDroid.TimesSquare.CalendarGridView, XLabs.Forms.Droid", CalendarGridView.class, __md_methods);
	}


	public CalendarGridView (android.content.Context p0)
	{
		super (p0);
		if (getClass () == CalendarGridView.class)
			mono.android.TypeManager.Activate ("XLabs.Forms.Controls.MonoDroid.TimesSquare.CalendarGridView, XLabs.Forms.Droid", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public CalendarGridView (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == CalendarGridView.class)
			mono.android.TypeManager.Activate ("XLabs.Forms.Controls.MonoDroid.TimesSquare.CalendarGridView, XLabs.Forms.Droid", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public CalendarGridView (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == CalendarGridView.class)
			mono.android.TypeManager.Activate ("XLabs.Forms.Controls.MonoDroid.TimesSquare.CalendarGridView, XLabs.Forms.Droid", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public CalendarGridView (android.content.Context p0, android.util.AttributeSet p1, int p2, int p3)
	{
		super (p0, p1, p2, p3);
		if (getClass () == CalendarGridView.class)
			mono.android.TypeManager.Activate ("XLabs.Forms.Controls.MonoDroid.TimesSquare.CalendarGridView, XLabs.Forms.Droid", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2, p3 });
	}


	public void addView (android.view.View p0, int p1, android.view.ViewGroup.LayoutParams p2)
	{
		n_addView (p0, p1, p2);
	}

	private native void n_addView (android.view.View p0, int p1, android.view.ViewGroup.LayoutParams p2);


	public void dispatchDraw (android.graphics.Canvas p0)
	{
		n_dispatchDraw (p0);
	}

	private native void n_dispatchDraw (android.graphics.Canvas p0);


	public boolean drawChild (android.graphics.Canvas p0, android.view.View p1, long p2)
	{
		return n_drawChild (p0, p1, p2);
	}

	private native boolean n_drawChild (android.graphics.Canvas p0, android.view.View p1, long p2);


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
