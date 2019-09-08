package md5951f1daac8310ab4f79f2797fa8f9e85;


public class MonthAdapter
	extends android.support.v4.view.PagerAdapter
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_getCount:()I:GetGetCountHandler\n" +
			"n_isViewFromObject:(Landroid/view/View;Ljava/lang/Object;)Z:GetIsViewFromObject_Landroid_view_View_Ljava_lang_Object_Handler\n" +
			"n_getPageWidth:(I)F:GetGetPageWidth_IHandler\n" +
			"n_instantiateItem:(Landroid/view/View;I)Ljava/lang/Object;:GetInstantiateItem_Landroid_view_View_IHandler\n" +
			"n_notifyDataSetChanged:()V:GetNotifyDataSetChangedHandler\n" +
			"n_destroyItem:(Landroid/view/View;ILjava/lang/Object;)V:GetDestroyItem_Landroid_view_View_ILjava_lang_Object_Handler\n" +
			"";
		mono.android.Runtime.register ("XLabs.Forms.Controls.MonoDroid.TimesSquare.MonthAdapter, XLabs.Forms.Droid", MonthAdapter.class, __md_methods);
	}


	public MonthAdapter ()
	{
		super ();
		if (getClass () == MonthAdapter.class)
			mono.android.TypeManager.Activate ("XLabs.Forms.Controls.MonoDroid.TimesSquare.MonthAdapter, XLabs.Forms.Droid", "", this, new java.lang.Object[] {  });
	}

	public MonthAdapter (android.content.Context p0, md5951f1daac8310ab4f79f2797fa8f9e85.CalendarPickerView p1)
	{
		super ();
		if (getClass () == MonthAdapter.class)
			mono.android.TypeManager.Activate ("XLabs.Forms.Controls.MonoDroid.TimesSquare.MonthAdapter, XLabs.Forms.Droid", "Android.Content.Context, Mono.Android:XLabs.Forms.Controls.MonoDroid.TimesSquare.CalendarPickerView, XLabs.Forms.Droid", this, new java.lang.Object[] { p0, p1 });
	}


	public int getCount ()
	{
		return n_getCount ();
	}

	private native int n_getCount ();


	public boolean isViewFromObject (android.view.View p0, java.lang.Object p1)
	{
		return n_isViewFromObject (p0, p1);
	}

	private native boolean n_isViewFromObject (android.view.View p0, java.lang.Object p1);


	public float getPageWidth (int p0)
	{
		return n_getPageWidth (p0);
	}

	private native float n_getPageWidth (int p0);


	public java.lang.Object instantiateItem (android.view.View p0, int p1)
	{
		return n_instantiateItem (p0, p1);
	}

	private native java.lang.Object n_instantiateItem (android.view.View p0, int p1);


	public void notifyDataSetChanged ()
	{
		n_notifyDataSetChanged ();
	}

	private native void n_notifyDataSetChanged ();


	public void destroyItem (android.view.View p0, int p1, java.lang.Object p2)
	{
		n_destroyItem (p0, p1, p2);
	}

	private native void n_destroyItem (android.view.View p0, int p1, java.lang.Object p2);

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
