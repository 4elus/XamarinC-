package md527a7103d6e2301228bd63a256515d332;


public class SensorBarDroidView
	extends android.view.View
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onDraw:(Landroid/graphics/Canvas;)V:GetOnDraw_Landroid_graphics_Canvas_Handler\n" +
			"";
		mono.android.Runtime.register ("XLabs.Forms.Controls.SensorBarDroidView, XLabs.Forms.Droid", SensorBarDroidView.class, __md_methods);
	}


	public SensorBarDroidView (android.content.Context p0)
	{
		super (p0);
		if (getClass () == SensorBarDroidView.class)
			mono.android.TypeManager.Activate ("XLabs.Forms.Controls.SensorBarDroidView, XLabs.Forms.Droid", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public SensorBarDroidView (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == SensorBarDroidView.class)
			mono.android.TypeManager.Activate ("XLabs.Forms.Controls.SensorBarDroidView, XLabs.Forms.Droid", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public SensorBarDroidView (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == SensorBarDroidView.class)
			mono.android.TypeManager.Activate ("XLabs.Forms.Controls.SensorBarDroidView, XLabs.Forms.Droid", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public SensorBarDroidView (android.content.Context p0, android.util.AttributeSet p1, int p2, int p3)
	{
		super (p0, p1, p2, p3);
		if (getClass () == SensorBarDroidView.class)
			mono.android.TypeManager.Activate ("XLabs.Forms.Controls.SensorBarDroidView, XLabs.Forms.Droid", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2, p3 });
	}


	public void onDraw (android.graphics.Canvas p0)
	{
		n_onDraw (p0);
	}

	private native void n_onDraw (android.graphics.Canvas p0);

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
