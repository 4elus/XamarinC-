package md59c7bf4379c77da4a1cafc5fead80896f;


public class NfcDevice
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.nfc.NfcAdapter.CreateNdefMessageCallback
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_createNdefMessage:(Landroid/nfc/NfcEvent;)Landroid/nfc/NdefMessage;:GetCreateNdefMessage_Landroid_nfc_NfcEvent_Handler:Android.Nfc.NfcAdapter/ICreateNdefMessageCallbackInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("XLabs.Platform.Services.NfcDevice, XLabs.Platform.Droid", NfcDevice.class, __md_methods);
	}


	public NfcDevice ()
	{
		super ();
		if (getClass () == NfcDevice.class)
			mono.android.TypeManager.Activate ("XLabs.Platform.Services.NfcDevice, XLabs.Platform.Droid", "", this, new java.lang.Object[] {  });
	}

	public NfcDevice (android.nfc.NfcAdapter p0)
	{
		super ();
		if (getClass () == NfcDevice.class)
			mono.android.TypeManager.Activate ("XLabs.Platform.Services.NfcDevice, XLabs.Platform.Droid", "Android.Nfc.NfcAdapter, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public android.nfc.NdefMessage createNdefMessage (android.nfc.NfcEvent p0)
	{
		return n_createNdefMessage (p0);
	}

	private native android.nfc.NdefMessage n_createNdefMessage (android.nfc.NfcEvent p0);

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
