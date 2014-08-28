<html>
<body>
<h2>IQS API summary</h2>
<div>
Base URL is http://lxbisel.macs.hw.ac.uk:8080/IQS/
</div>
<div>
<h3>/getImages</h3>
<h4>parameters</h4>
All parameters are optional
<ol>
<li>term - any text or ID</li>
<li>phenotype - phenotype ID or term, e.g. MP:0010254 or cataracts</li>
<li>anatomy - anatomy ID or term, e.g. MA:0000261 or eye</li>
<li>gene - gene ID or symbol, e.g. MGI:1891295 or Spns2</li>
<li>expressedFeature - gene (or allele) symbol or ID, e.g., Sesn3</li>
<li>sex - i.e., MALE/FEMALE</li>
<li>taxon - NCBI ID or text/label, e.g., Mus Musculus</li>
<li>stage - stage ontology ID or text, e.g., postnatal stage/ MmusDv_0000092</li>
<li>samplePreparation - label or term ID below "sample preparation" in the FBBI ontology, e.g., living tissue</li>
<li>imagingMethod - label or term ID below "imaging method" in the FBBI ontology, e.g., macroscopy</li>
<li>num - number of results to be returned, default is 100</li>
<li>start - first result to be returned, default is 0</li>
</ol>

<!--
Examples:
<ol>
<li>http://lxbisel.macs.hw.ac.uk:8080/IQS/getimages?phenotype=MP:0010254</li>
<li>http://lxbisel.macs.hw.ac.uk:8080/IQS/getimages?phenotype=MP:0010254&start=1</li>
<li>http://lxbisel.macs.hw.ac.uk:8080/IQS/getimages?phenotype=MP:0010254&num=1</li>
<li>http://lxbisel.macs.hw.ac.uk:8080/IQS/getimages?phenotype=cataracts</li>
<li>http://lxbisel.macs.hw.ac.uk:8080/IQS/getimages?anatomy=eye</li>
<li>http://lxbisel.macs.hw.ac.uk:8080/IQS/getimages?gene=Spns2</li>
</ol>
-->
</div>

<div>
<h3>/getRoi</h3>
<h4>parameters</h4>
Parameter is mandatory
<ol>
<li>id - ROI ID, e.g. komp2_roi_112003_0</li>
</ol>

<!--
Example:
<ol>
<li>http://lxbisel.macs.hw.ac.uk:8080/IQS/getroi?id=komp2_roi_112003_0</li>
</ol>
-->
</div>

<div>
<h3>/getRois</h3>
Get all the ROIs in a particular image
<h4>parameters</h4>
Parameter is mandatory
<ol>
<li>imageId - image ID, e.g. komp2_112003</li>
<li>num - number of results to be returned, default is 100</li>
<li>start - first result to be returned, default is 0</li>
</ol>

<!--
Example:
<ol>
<li>http://lxbisel.macs.hw.ac.uk:8080/IQS/getroi?id=komp2_roi_112003_0</li>
</ol>
-->
</div>


<div>
<h3>/getChannel</h3>
<h4>parameters</h4>
Parameter is mandatory
<ol>
<li>id - Channel ID, e.g., komp2_channel_112003_0</li>
</ol>
<!--
Example:
<ol>
<li>http://lxbisel.macs.hw.ac.uk:8080/IQS/getchannel?id=komp2_channel_112003_0</li>
</ol>
-->
</div>

<div>
<h3>/getChannels</h3>
Find all the channels in a particular image
<h4>parameters</h4>
Parameter is mandatory
<ol>
<li>imageId - Image ID, e.g., komp2_112003</li>
<li>num - number of results to be returned, default is 100</li>
<li>start - first result to be returned, default is 0</li>
</ol>
<!--
Example:
<ol>
<li>http://lxbisel.macs.hw.ac.uk:8080/IQS/getchannel?id=komp2_channel_112003_0</li>
</ol>
-->
</div>

</div>
</body>
</html>