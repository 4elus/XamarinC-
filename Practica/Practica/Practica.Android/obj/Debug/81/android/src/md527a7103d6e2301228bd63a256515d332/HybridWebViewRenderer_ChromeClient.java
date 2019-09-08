package md527a7103d6e2301228bd63a256515d332;


public class HybridWebViewRenderer_ChromeClient
	extends android.webkit.WebChromeClient
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onGeolocationPermissionsShowPrompt:(Ljava/lang/String;Landroid/webkit/GeolocationPermissions$Callback;)V:GetOnGeolocationPermissionsShowPrompt_Ljava_lang_String_Landroid_webkit_GeolocationPermissions_Callback_Handler\n" +
			"";
		mono.android.Runtime.register ("XLabs.Forms.Controls.HybridWebViewRenderer+ChromeClient, XLabs.Forms.Droid", HybridWebViewRenderer_ChromeClient.class, __md_methods);
	}


	public HybridWebViewRenderer_ChromeClient ()
	{
		super ();
		if (getClass () == HybridWebViewRenderer_ChromeClient.class)
			mono.android.TypeManager.Activate ("XLabs.Forms.Controls.HybridWebViewRenderer+ChromeClient, XLabs.Forms.Droid", "", this, new java.lang.Object[] {  });
	}


	public void onGeolocationPermissionsShowPrompt (java.lang.String p0, android.webkit.GeolocationPermissions.Callback p1)
	{
		n_onGeolocationPermissionsShowPrompt (p0, p1);
	}

	private native void n_onGeolocationPermissionsShowPrompt (java.lang.String p0, android.webkit.GeolocationPermissions.Callback p1);

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
