Sample text message : ${msg}

--------------------------------------------------------

<#list samples as sample>
${sample.sampleId}: ${sample.sampleName} : ${sample.samplePrice}
</#list>

--------------------------------------------------------

<#assign name = "Hasitha">
I'm ${name}.

--------------------------------------------------------

<#if value gt 85>
GOOD
<#elseif value gt 50>
PASS
<#elseif value < 0>
INVALID
<#else>
FAIL
</#if>