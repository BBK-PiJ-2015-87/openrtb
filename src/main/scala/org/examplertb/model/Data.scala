package org.examplertb.model

/**
  * Contains additional data about the user.
  *
  * @param id Exchange-specific ID for the data provider.
  * @param name Exchange-specific name for the data provider.
  * @param segment list of Segment objects that contain the actual data values.
  * @param ext Placeholder for exchange-specific extensions to OpenRTB
  */
case class Data(
               id:        Option[String] = None,
               name:      Option[String] = None,
               segment:   Option[List[Segment]] = None,
               ext:       Option[Ext] = None
               )
{
}
