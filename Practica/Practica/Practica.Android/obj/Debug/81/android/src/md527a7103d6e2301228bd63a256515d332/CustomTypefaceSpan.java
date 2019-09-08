package md527a7103d6e2301228bd63a256515d332;


public class CustomTypefaceSpan
	extends android.text.style.TypefaceSpan
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_updateDrawState:(Landroid/text/TextPaint;)V:GetUpdateDrawState_Landroid_text_TextPaint_Handler\n" +
			"n_updateMeasureState:(Landroid/text/TextPaint;)V:GetUpdateMeasureState_Landroid_text_TextPaint_Handler\n" +
			"";
		mono.android.Runtime.register ("XLabs.Forms.Controls.CustomTypefaceSpan, XLabs.Forms.Droid", CustomTypefaceSpan.class, __md_methods);
	}


	public CustomTypefaceSpan (android.os.Parcel p0)
	{
		super (p0);
		if (getClass () == CustomTypefaceSpan.class)
			mono.android.TypeManager.Activate ("XLabs.Forms.Controls.CustomTypefaceSpan, XLabs.Forms.Droid", "Android.OS.Parcel, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public CustomTypefaceSpan (java.lang.String p0)
	{
		super (p0);
		if (getClass () == CustomTypefaceSpan.class)
			mono.android.TypeManager.Activate ("XLabs.Forms.Controls.CustomTypefaceSpan, XLabs.Forms.Droid", "System.String, mscorlib", this, new java.lang.Object[] { p0 });
	}


	public void updateDrawState (android.text.TextPaint p0)
	{
		n_updateDrawState (p0);
	}

	private native void n_updateDrawState (android.text.TextPaint p0);


	public void updateMeasureState (android.text.TextPaint p0)
	{
		n_updateMeasureState (p0);
	}

	private native void n_updateMeasureState (android.text.TextPaint p0);

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
