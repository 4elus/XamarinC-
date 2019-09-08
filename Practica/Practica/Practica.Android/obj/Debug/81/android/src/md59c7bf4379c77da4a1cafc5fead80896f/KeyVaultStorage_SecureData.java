package md59c7bf4379c77da4a1cafc5fead80896f;


public class KeyVaultStorage_SecureData
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		javax.crypto.SecretKey,
		java.security.Key,
		java.io.Serializable
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_getAlgorithm:()Ljava/lang/String;:GetGetAlgorithmHandler:Java.Security.IKeyInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_getFormat:()Ljava/lang/String;:GetGetFormatHandler:Java.Security.IKeyInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_getEncoded:()[B:GetGetEncodedHandler:Java.Security.IKeyInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("XLabs.Platform.Services.KeyVaultStorage+SecureData, XLabs.Platform.Droid", KeyVaultStorage_SecureData.class, __md_methods);
	}


	public KeyVaultStorage_SecureData ()
	{
		super ();
		if (getClass () == KeyVaultStorage_SecureData.class)
			mono.android.TypeManager.Activate ("XLabs.Platform.Services.KeyVaultStorage+SecureData, XLabs.Platform.Droid", "", this, new java.lang.Object[] {  });
	}

	public KeyVaultStorage_SecureData (byte[] p0)
	{
		super ();
		if (getClass () == KeyVaultStorage_SecureData.class)
			mono.android.TypeManager.Activate ("XLabs.Platform.Services.KeyVaultStorage+SecureData, XLabs.Platform.Droid", "System.Byte[], mscorlib", this, new java.lang.Object[] { p0 });
	}


	public java.lang.String getAlgorithm ()
	{
		return n_getAlgorithm ();
	}

	private native java.lang.String n_getAlgorithm ();


	public java.lang.String getFormat ()
	{
		return n_getFormat ();
	}

	private native java.lang.String n_getFormat ();


	public byte[] getEncoded ()
	{
		return n_getEncoded ();
	}

	private native byte[] n_getEncoded ();

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
