/** Generated Model - DO NOT CHANGE */
package de.metas.esb.edi.model;

import java.sql.ResultSet;
import java.util.Properties;

/** Generated Model for EDI_M_Product_Lookup_UPC_v
 *  @author metasfresh (generated) 
 */
@SuppressWarnings("javadoc")
public class X_EDI_M_Product_Lookup_UPC_v extends org.compiere.model.PO implements I_EDI_M_Product_Lookup_UPC_v, org.compiere.model.I_Persistent 
{

	private static final long serialVersionUID = -965063693L;

    /** Standard Constructor */
    public X_EDI_M_Product_Lookup_UPC_v (Properties ctx, int EDI_M_Product_Lookup_UPC_v_ID, String trxName)
    {
      super (ctx, EDI_M_Product_Lookup_UPC_v_ID, trxName);
    }

    /** Load Constructor */
    public X_EDI_M_Product_Lookup_UPC_v (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }


	/** Load Meta Data */
	@Override
	protected org.compiere.model.POInfo initPO(Properties ctx)
	{
		return org.compiere.model.POInfo.getPOInfo(Table_Name);
	}

	@Override
	public void setGLN (java.lang.String GLN)
	{
		set_Value (COLUMNNAME_GLN, GLN);
	}

	@Override
	public java.lang.String getGLN() 
	{
		return (java.lang.String)get_Value(COLUMNNAME_GLN);
	}
}