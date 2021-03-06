<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN" "http://www.w3.org/TR/REC-html40/loose.dtd">
<html>
    <body>
        <h2>IQS API summary</h2>

        <!--
        <div>
            Base URL is <%= uk.ac.hw.macs.bisel.phis.iqs.GetHost.getURI()%>
        </div>

        <hr> 
        -->
        <h3>Key</h3>
        <div style="background-color: grey;">
            Depreciated parameters or methods are given a grey background colour.
        </div>
        <div style="background-color: orange;">
            New parameters or methods are given an orange background colour.
        </div>
        <div>
            Unchanged parameters or methods are given a normal white background colour.
        </div>

        <h3>Notes</h3>
        <div>
            This is v005, to use it append &version=005 to your URL.  Please note that some of the behaviour is still not fully tested.
            <br />
            <a href="${pageContext.request.contextPath}/v003-4.jsp">Click here to use either 003 or 004</a>.            
        </div>

        <hr>

        <div>
            <h3 style="background-color: orange;">/getImage</h3>
            <h4>parameters</h4>
            All parameters are optional

            <table class="table table-striped">
                <thead>
                    <tr>
                        <th>Name</th>
                        <th>Type</th>
                        <th>Required</th>
                        <th>Description</th>
                        <th>Default</th>
                        <th>Example Values</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>imageId</td>
                        <td><var>String</var></td>
                        <td> false</td>
                        <td>ROI associated to the image.</td>
                        <td><var> * </var></td>
                        <td><var>komp2_112003</var><br></td>
                    </tr>
                </tbody>
            </table>
            <h4>Examples:</h4>
            <ol>
                <li><a href="<%= uk.ac.hw.macs.bisel.phis.iqs.GetHost.getURI()%>getImage?imageId=komp2_112968"><%= uk.ac.hw.macs.bisel.phis.iqs.GetHost.getURI()%>getImage?imageId=komp2_112968</a></li>
            </ol>

        </div>

        <hr/>

        <div>
            <h3>/getImages</h3>
            <h4>parameters</h4>
            All parameters are optional

            <table class="table table-striped">
                <thead>
                    <tr>
                        <th>Name</th>
                        <th>Type</th>
                        <th>Required</th>
                        <th>Description</th>
                        <th>Default</th>
                        <th>Example Values</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>term</td>
                        <td><var>String</var></td>
                        <td>false</td>
                        <td>Term to search in any searchable field. Can be id or text for any field accessible. These are anatomy, gene and phenotype fields as well as image source and image visualization method, sample preparation.</td>
                        <td><var> * </var></td>
                        <td><var>eye</var><br></td>
                    </tr>
                    <tr>
                        <td>phenotype</td>
                        <td><var>String</var></td>
                        <td>false</td>
                        <td>Images depicting the phenotype term passed.</td>
                        <td><var> * </var></td>
                        <td><var>MP:0010254</var><br></td>
                    </tr>
                    <tr>
                        <td>anatomy</td>
                        <td><var>String</var></td>
                        <td>false</td>
                        <td>Images depicting the given anatomical structure, regardless
                            of abnormalities.</td>
                        <td><var> * </var></td>
                        <td><var>MA:0000261, eye</var></td>
                    </tr>
                    <tr style="background-color: grey;">
                        <td>gene</td>
                        <td><var>String</var></td>
                        <td>false</td>
                        <td> [TO BE DEPRECATED] Use mutantGene instead. Filters for samples with a mutation in the specified gene.</td>
                        <td><var> * </var></td>
                        <td><var>MGI:1891295, Spns2</var></td>
                    </tr>			
                    <tr>
                        <td>mutantGene</td>
                        <td><var>String</var></td>
                        <td>false</td>
                        <td>Filters for samples with a mutation in the specified gene.</td>
                        <td><var> * </var></td>
                        <td><var>MGI:1891295, Spns2</var></td>
                    </tr>			
                    <tr>
                        <td>expressedFeature</td>
                        <td><var>String</var></td>
                        <td>false</td>
                        <td>Filters for images depicting expression of the specified feature (gene or allele symbol or id).</td>
                        <td><var> * </var></td>
                        <td><var> Sesn3 </var></td>
                    </tr>			
                    <tr>
                        <td>sex</td>
                        <td><var>String</var></td>
                        <td>false</td>
                        <td>Returns only images of samples with the specified sex.</td>
                        <td><var> * </var></td>
                        <td><var> FEMALE / MALE </var> </td>
                    </tr>
                    <tr>
                        <td>taxon</td>
                        <td><var>String</var></td>
                        <td>false</td>
                        <td>NCBI id or text / label of a taxon.</td>
                        <td><var> * </var></td>
                        <td><var> Mus musculus </var> </td>
                    </tr>

                    <tr>
                        <td>sampleType</td>
                        <td><var>String</var></td>
                        <td>false</td>
                        <td>For mutant/wildType facet filtering.</td>
                        <td><var> * </var></td>
                        <td><var> WILD_TYPE </var> or <var>MUTANT</var> </td>
                    </tr>


                    <tr>
                        <td>imageType</td>
                        <td><var>String</var></td>
                        <td>false</td>
                        <td>Filter on expression or anatomy/phenotype images for faceting.</td>
                        <td><var> * </var></td>
                        <td><var> EXPRESSION </var> or <var>PHENOTYPE_ANATOMY </var> </td>
                    </tr>
                    <tr>
                        <td>stage</td>
                        <td><var>String</var></td>
                        <td>false</td>
                        <td>Stage ontology id or text.</td>
                        <td><var> * </var></td>
                        <td><var> postnatal stage / MmusDv_0000092 </var> </td>
                    </tr>

                    <tr>
                        <td>samplePreparation</td>
                        <td><var>String</var></td>
                        <td>false</td>
                        <td>Label or id of a child of Sample Preparation in FBBI ontology.</td>
                        <td><var> * </var></td>
                        <td><var> living tissue </var> </td>
                    </tr>			
                    <tr>
                        <td>imagingMethod</td>
                        <td><var>String</var></td>
                        <td>false</td>
                        <td>Label or id of a child of Imaging Method in FBBI ontology..</td>
                        <td><var> * </var></td>
                        <td><var> macroscopy </var> </td>
                    </tr>			
                    <tr>
                        <td>num</td>
                        <td><var>Integer</var></td>
                        <td>false</td>
                        <td>Number of result objects to be returned back.</td>
                        <td><var>100</var></td>
                        <td><var></var><br></td>
                    </tr>			
                    <tr>
                        <td>start</td>
                        <td><var>Integer</var></td>
                        <td>false</td>
                        <td>Start position to return the results. Useful for pagination.</td>
                        <td><var>0</var></td>
                        <td><var></var><br></td>
                    </tr>
                    <tr style="background-color: orange;">
                        <td>version</td>
                        <td><var>String</var></td>
                        <td>false</td>
                        <td>Version of EBI to use.</td>
                        <td><var> 003 </var></td>
                        <td><var>003 or 004</var></td>
                    </tr>			

                </tbody>
            </table>

            <h4>Examples:</h4>
            <ol>
                <li><a href="<%= uk.ac.hw.macs.bisel.phis.iqs.GetHost.getURI()%>getImages?term=eye&version=005"><%= uk.ac.hw.macs.bisel.phis.iqs.GetHost.getURI()%>getImages?term=eye&version=005</a></li>
                <li><a href="<%= uk.ac.hw.macs.bisel.phis.iqs.GetHost.getURI()%>getImages?phenotype=MP:0010254&version=005"><%= uk.ac.hw.macs.bisel.phis.iqs.GetHost.getURI()%>getImages?phenotype=MP:0010254&version=005</a></li>
                <li><a href="<%= uk.ac.hw.macs.bisel.phis.iqs.GetHost.getURI()%>getImages?phenotype=MP:0010254&start=1&version=005"><%= uk.ac.hw.macs.bisel.phis.iqs.GetHost.getURI()%>getImages?phenotype=MP:0010254&start=1&version=005</a></li>
                <li><a href="<%= uk.ac.hw.macs.bisel.phis.iqs.GetHost.getURI()%>getImages?phenotype=MP:0010254&num=1&version=005"><%= uk.ac.hw.macs.bisel.phis.iqs.GetHost.getURI()%>getImages?phenotype=MP:0010254&num=1&version=005</a></li>
                <li><a href="<%= uk.ac.hw.macs.bisel.phis.iqs.GetHost.getURI()%>getImages?phenotype=cataracts&version=005"><%= uk.ac.hw.macs.bisel.phis.iqs.GetHost.getURI()%>getImages?phenotype=cataracts&version=005</a></li>
                <li><a href="<%= uk.ac.hw.macs.bisel.phis.iqs.GetHost.getURI()%>getImages?anatomy=eye&version=005"><%= uk.ac.hw.macs.bisel.phis.iqs.GetHost.getURI()%>getImages?anatomy=eye&version=005</a></li>
                <li><a href="<%= uk.ac.hw.macs.bisel.phis.iqs.GetHost.getURI()%>getImages?gene=Spns2&version=005"><%= uk.ac.hw.macs.bisel.phis.iqs.GetHost.getURI()%>getImages?gene=Spns2&version=005</a></li>
            </ol>
        </div>

        <hr>                

        <div>
            <h3>/getRoi</h3>
            <h4>parameters</h4>
            roiId parameter is mandatory
            <table class="table table-striped">
                <thead>
                    <tr>
                        <th>Name</th>
                        <th>Type</th>
                        <th>Required</th>
                        <th>Description</th>
                        <th>Default</th>
                        <th>Example Values</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>roiId</td>
                        <td><var>String</var></td>
                        <td> true</td>
                        <td>ROI with the specified id.</td>
                        <td><var> * </var></td>
                        <td><var>komp2_roi_112003_0</var><br></td>
                    </tr>
                    <tr style="background-color: orange;">
                        <td>version</td>
                        <td><var>String</var></td>
                        <td>false</td>
                        <td>Version of EBI to use.</td>
                        <td><var> 003 </var></td>
                        <td><var>003 or 004</var></td>
                    </tr>			                    
                </tbody>
            </table>


            <h4>Example:</h4>
            <ol>
                <li><a href="<%= uk.ac.hw.macs.bisel.phis.iqs.GetHost.getURI()%>getRoi?id=komp2_roi_112003_0&version=005"><%= uk.ac.hw.macs.bisel.phis.iqs.GetHost.getURI()%>getRoi?id=komp2_roi_112003_0&version=005</a></li>
            </ol>
        </div>

        <hr>                

        <div>
            <h3>/getRois</h3>
            Get all the ROIs in a particular image
            <h4>parameters</h4>
            imageId parameter is mandatory
            <table class="table table-striped">
                <thead>
                    <tr>
                        <th>Name</th>
                        <th>Type</th>
                        <th>Required</th>
                        <th>Description</th>
                        <th>Default</th>
                        <th>Example Values</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>imageId</td>
                        <td><var>String</var></td>
                        <td> false</td>
                        <td>ROI associated to the image.</td>
                        <td><var> * </var></td>
                        <td><var>komp2_112003</var><br></td>
                    </tr>
                    <tr>
                        <td>num</td>
                        <td><var>Integer</var></td>
                        <td>false</td>
                        <td>Number of result objects to be returned back.</td>
                        <td><var>100</var></td>
                        <td><var></var><br></td>
                    </tr>
                    <tr>
                        <td>start</td>
                        <td><var>Integer</var></td>
                        <td>false</td>
                        <td>Start position to return the results. Useful for pagination.</td>
                        <td><var>0</var></td>
                        <td><var></var><br></td>
                    </tr>
                    <tr style="background-color: orange;">
                        <td>version</td>
                        <td><var>String</var></td>
                        <td>false</td>
                        <td>Version of EBI to use.</td>
                        <td><var> 003 </var></td>
                        <td><var>003 or 004</var></td>
                    </tr>			                    
                </tbody>
            </table>

            <h4>Example:</h4>
            <ol>
                <li><a href="<%= uk.ac.hw.macs.bisel.phis.iqs.GetHost.getURI()%>getRois?imageId=komp2_112003&version=005"><%= uk.ac.hw.macs.bisel.phis.iqs.GetHost.getURI()%>getRois?imageId=komp2_112003&version=005</a></li>
            </ol>
        </div>

        <hr>                

        <div>
            <h3>/getChannel</h3>
            <h4>parameters</h4>
            channelId parameter is mandatory
            <table class="table table-striped">
                <thead>
                    <tr>
                        <th>Name</th>
                        <th>Type</th>
                        <th>Required</th>
                        <th>Description</th>
                        <th>Default</th>
                        <th>Example Values</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>channelId</td>
                        <td><var>String</var></td>
                        <td> true</td>
                        <td>Channel with the specified id.</td>
                        <td><var> * </var></td>
                        <td><var>komp2_channel_112003_0</var><br></td>
                    </tr>
                    <tr style="background-color: orange;">
                        <td>version</td>
                        <td><var>String</var></td>
                        <td>false</td>
                        <td>Version of EBI to use.</td>
                        <td><var> 003 </var></td>
                        <td><var>003 or 004</var></td>
                    </tr>			                    
                </tbody>
            </table>

            <h4>Example:</h4>
            <ol>
                <li><a href="<%= uk.ac.hw.macs.bisel.phis.iqs.GetHost.getURI()%>getChannel?id=komp2_channel_112003_0&version=005"><%= uk.ac.hw.macs.bisel.phis.iqs.GetHost.getURI()%>getChannel?id=komp2_channel_112003_0&version=005</a></li>
            </ol>
        </div>

        <hr>                

        <div>
            <h3>/getChannels</h3>
            Find all the channels in a particular image
            <h4>parameters</h4>
            imageId parameter is mandatory
            <table class="table table-striped">
                <thead>
                    <tr>
                        <th>Name</th>
                        <th>Type</th>
                        <th>Required</th>
                        <th>Description</th>
                        <th>Default</th>
                        <th>Example Values</th>
                    </tr>
                </thead>

                <tbody>
                    <tr>
                        <td>imageId</td>
                        <td><var>String</var></td>
                        <td> true</td>
                        <td>Channel with the specified id.</td>
                        <td><var> * </var></td>
                        <td><var>komp2_112003</var><br></td>
                    </tr>

                    <tr>
                        <td>num</td>
                        <td><var>Integer</var></td>
                        <td>false</td>
                        <td>Number of result objects to be returned back.</td>
                        <td><var>100</var></td>
                        <td><var></var><br></td>
                    </tr>

                    <tr>
                        <td>start</td>
                        <td><var>Integer</var></td>
                        <td>false</td>
                        <td>Start position to return the results. Useful for pagination.</td>
                        <td><var>0</var></td>
                        <td><var></var><br></td>
                    </tr>
                    <tr style="background-color: orange;">
                        <td>version</td>
                        <td><var>String</var></td>
                        <td>false</td>
                        <td>Version of EBI to use.</td>
                        <td><var> 003 </var></td>
                        <td><var>003 or 004</var></td>
                    </tr>			
                </tbody>

            </table>

            <h4>Example:</h4>
            <ol>
                <li><a href="<%= uk.ac.hw.macs.bisel.phis.iqs.GetHost.getURI()%>getChannels?imageId=komp2_112003&version=005"><%= uk.ac.hw.macs.bisel.phis.iqs.GetHost.getURI()%>getChannels?imageId=komp2_112003&version=005</a></li>
            </ol>

        </div>

        <hr>    

        <div>
            <h3>/getAutosuggest</h3>
            Supports auto-complete
            <h4>parameters</h4>
            One of the parameters (term, mutantGene, mutantGene or phenotype) is required.
            <table class="table table-striped">
                <thead>
                    <tr>
                        <th>Name</th>
                        <th>Type</th>
                        <th>Required</th>
                        <th>Description</th>
                        <th>Default</th>
                        <th>Example Values</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>term</td>
                        <td><var>String</var></td>
                        <td> false </td>
                        <td>Return list of suggestions containing the passed string, with the containing words highlighted.</td>
                        <td><var>*</var></td>
                        <td><var>abn</var><br></td>
                    </tr>                   



                    <tr style="background-color: orange;">
                        <td>type</td>
                        <td><var>String</var></td>
                        <td> false </td>
                        <td>Not sure what this does... seems to be a mistake by IT in the documentation... probably should be depreciated</td>
                        <td><var></var></td>
                        <td><var></var><br></td>
                    </tr>     
                    <tr style="background-color: orange;">
                        <td>asType</td>
                        <td><var>String</var></td>
                        <td> false </td>
                        <td>If specified autosuggest will be typed (i.e. return only gene names matching the typed string). If left out autosuggest will be in generic mode.</td>
                        <td><var></var></td>
                        <td><var>GENE | ANATOMY | PHENOTYPE</var><br></td>
                    </tr>                    
                    <tr style="background-color: orange;">
                        <td>stage</td>
                        <td><var>String</var></td>
                        <td> false </td>
                        <td>Restricts results for autosuggest to documents for the stage passed.</td>
                        <td><var></var></td>
                        <td><var>postnatal stage</var><br></td>
                    </tr>  
                    <tr style="background-color: orange;">
                        <td>imagingMethod</td>
                        <td><var>String</var></td>
                        <td> false </td>
                        <td>Restricts results for autosuggest to documents for the imaging method passed.</td>
                        <td><var></var></td>
                        <td><var>X-ray illumination</var><br></td>
                    </tr>                      
                    <tr style="background-color: orange;">
                        <td>taxon</td>
                        <td><var>String</var></td>
                        <td> false </td>
                        <td>Restricts results for autosuggest to documents for the taxon passed.</td>
                        <td><var></var></td>
                        <td><var>Mus musculus</var><br></td>
                    </tr>   
                    <tr style="background-color: orange;">
                        <td>sampleType</td>
                        <td><var>String</var></td>
                        <td> false </td>
                        <td>Restricts results for autosuggest to documents for the sampleType passed.</td>
                        <td><var></var></td>
                        <td><var>MUTANT</var><br></td>
                    </tr>   
                    <tr style="background-color: orange;">
                        <td>imageGeneratedBy</td>
                        <td><var>String</var></td>
                        <td> false </td>
                        <td>Restricts results for autosuggest to documents for images generated by the institute passed.</td>
                        <td><var></var></td>
                        <td><var>WTSI</var><br></td>
                    </tr>                      


                    <tr style="background-color: grey;">
                        <td>mutantGene</td>
                        <td><var>String</var></td>
                        <td> false</td>
                        <td>Suggestions for mutant gene symbols from annotations, with highlights.</td>
                        <td><var>*</var></td>
                        <td><var>a</var><br></td>
                    </tr>
                    <tr style="background-color: grey;">
                        <td>expressedGeneOrAllele</td>
                        <td><var>String</var></td>
                        <td> false </td>
                        <td>Suggestions for expressed gene or allele symbols, with highlights.</td>
                        <td><var>*</var></td>
                        <td><var>m</var><br></td>
                    </tr>
                    <tr style="background-color: grey;">
                        <td>phenotype</td>
                        <td><var>String</var></td>
                        <td> false</td>
                        <td>Suggestions for phenotype labels from annotations, with highlights.</td>
                        <td><var>*</var></td>
                        <td><var>abn</var><br></td>
                    </tr>
                    <tr>
                        <td>num</td>
                        <td><var>Integer</var></td>
                        <td> false</td>
                        <td>Max number of suggestions to be returned.</td>
                        <td><var>10</var></td>
                        <td><var>20</var><br></td>
                    </tr>
                    <tr style="background-color: orange;">
                        <td>version</td>
                        <td><var>String</var></td>
                        <td>false</td>
                        <td>Version of EBI to use.</td>
                        <td><var> 003 </var></td>
                        <td><var>003 or 004</var></td>
                    </tr>			                    
                </tbody>
            </table>            

            <h4>Example:</h4>
            <ol>
                <li><a href="<%= uk.ac.hw.macs.bisel.phis.iqs.GetHost.getURI()%>getAutosuggest?term=ey&version=005"><%= uk.ac.hw.macs.bisel.phis.iqs.GetHost.getURI()%>getAutosuggest?term=ey&version=005</a></li>
            </ol>            

        </div>
    </body>
</html>
