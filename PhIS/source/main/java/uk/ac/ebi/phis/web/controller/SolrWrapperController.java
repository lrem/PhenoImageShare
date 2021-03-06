/*******************************************************************************
 * Copyright 2015 EMBL - European Bioinformatics Institute
 *
 * Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific
 * language governing permissions and limitations under the
 * License.
 *******************************************************************************/
package uk.ac.ebi.phis.web.controller;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Date;

import org.apache.solr.client.solrj.SolrServerException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import uk.ac.ebi.phis.exception.PhisQueryException;
import uk.ac.ebi.phis.service.AutosuggestService;
import uk.ac.ebi.phis.service.ChannelService;
import uk.ac.ebi.phis.service.ImageService;
import uk.ac.ebi.phis.service.Neo4jService;
import uk.ac.ebi.phis.service.RoiService;
import uk.ac.ebi.phis.solrj.dto.AutosuggestTypes;
import uk.ac.ebi.phis.utils.web.RestStatusMessage;

//CrossOrigin(origins = "http://fiddle.jshell.net", maxAge = 3600)
@Controller
@RequestMapping("/rest")
public class SolrWrapperController {


	@Autowired
	ImageService is;

	@Autowired
	RoiService rs;

	@Autowired
	ChannelService cs;

	@Autowired
	AutosuggestService as;

	@Autowired
	Neo4jService ns;
		
	/**
	 * 
	 * @param phenotype
	 * @param anatomy
	 * @param gene
	 * @param resultNo
	 * @param model
	 * @return
	 * @throws SolrServerException
	 * @throws IOException
	 * @throws URISyntaxException
	 */
	@RequestMapping(value="/getImages", method=RequestMethod.GET)	
    public @ResponseBody String getExperimentalData(
    		@RequestParam(value = "term", required = false) String term,
    		@RequestParam(value = "phenotype", required = false) String phenotype,
            @RequestParam(value = "anatomy", required = false) String anatomy,
            @RequestParam(value = "gene", required = false) String gene,
            @RequestParam(value = "mutantGene", required = false) String mutantGene,
            @RequestParam(value = "expressedFeature", required = false) String expressedGene,
            @RequestParam(value = "sex", required = false) String sex,
            @RequestParam(value = "taxon", required = false) String taxon,
            @RequestParam(value = "imageType", required = false) String image_type,
            @RequestParam(value = "sampleType", required = false) String sample_type,
            @RequestParam(value = "stage", required = false) String stage,
            @RequestParam(value = "visualisationMethod", required = false) String visualisationMethod,
            @RequestParam(value = "samplePreparation", required = false) String samplePreparation,
            @RequestParam(value = "imagingMethod", required = false) String imagingMethod,
            @RequestParam(value = "chromosome", required = false) String chromosome,
            @RequestParam(value = "position", required = false) String strand,
            @RequestParam(value = "hostName", required = false) String hostName,
            @RequestParam(value = "location", required = false) Long position,
            @RequestParam(value = "startPosition", required = false) Long startPosition,
            @RequestParam(value = "endPosition", required = false) Long endPosition,
            @RequestParam(value = "resultNo", required = false) Integer resultNo,
            @RequestParam(value = "start", required = false) Integer start,
    		Model model
            ) throws SolrServerException, IOException, URISyntaxException {
				
		try{
			return is.getImages(term, phenotype, mutantGene, anatomy, expressedGene, sex, taxon, image_type, sample_type, stage, visualisationMethod, 
						samplePreparation, imagingMethod, resultNo, start, gene, chromosome, strand, position, startPosition, endPosition, hostName);
		} catch (PhisQueryException e){
			JSONObject succeded = RestStatusMessage.getFailJson();
			succeded.put("message", e.getMessage());
			return succeded.toString();
		}
    }
	

	@RequestMapping(value="/getImage", method=RequestMethod.GET)	
    public @ResponseBody String getImage(@RequestParam(value = "imageId", required = true) String imageId, Model model) 
    throws SolrServerException, IOException, URISyntaxException {
		
		if (imageId != null){
			return is.getImageAsJsonString(imageId);
		}
		return "";
    }
	
	
	@RequestMapping(value="/getAutosuggest", method=RequestMethod.GET)
	public  @ResponseBody String getSuggestions(
			@RequestParam(value = "term", required = false) String term,
			@RequestParam(value = "autosuggestType", required = false) String type,
			@RequestParam(value = "resultNo", required = false) Integer resultNo,
			@RequestParam(value = "taxon", required = false) String taxon,
			@RequestParam(value = "sampleType", required = false) String sampleType,
			@RequestParam(value = "stage", required = false) String stage,
			@RequestParam(value = "imagingMethod", required = false) String imagingMethod,
			@RequestParam(value = "imageGeneratedBy", required = false) String imageGeneratedBy,	
			Model model){
			
		if (term != null){
			return as.getAutosuggest(term, (type != null ? AutosuggestTypes.valueOf(type) : null), stage, imagingMethod, taxon, sampleType, imageGeneratedBy, resultNo);
		} 
		
		return "";
	}
	
	@RequestMapping(value="/getComplexAutosuggest", method=RequestMethod.GET)
	public  @ResponseBody String getComplexSuggestions(
			@RequestParam(value = "term", required = false) String term,
			@RequestParam(value = "autosuggestType", required = false) String type,
			@RequestParam(value = "resultNo", required = false) Integer resultNo,
			@RequestParam(value = "taxon", required = false) String taxon,
			@RequestParam(value = "sampleType", required = false) String sampleType,
			@RequestParam(value = "stage", required = false) String stage,
			@RequestParam(value = "imagingMethod", required = false) String imagingMethod,
			@RequestParam(value = "imageGeneratedBy", required = false) String imageGeneratedBy,
			Model model){
			
		if (term != null){
			return as.getComplexAutosuggest(term, (type != null ? AutosuggestTypes.valueOf(type) : null), stage, imagingMethod, taxon, sampleType, imageGeneratedBy, resultNo);
		} 
		
		return "";
	}
	
	
	
	
	@RequestMapping(value="/getRois", method=RequestMethod.GET)	
    public @ResponseBody String getRois(
    		@RequestParam(value = "roiId", required = false) String roiId,
    		@RequestParam(value = "imageId", required = false) String imageId,
    		@RequestParam(value = "resultNo", required = false) Integer resultNo,
    		@RequestParam(value = "userId", required = false) String userOwner,
    		@RequestParam(value = "userGroupId", required = false) String userGroup,
    		@RequestParam(value = "createdAfter", required = false) String createdAfter,
    		@RequestParam(value = "createdBefore", required = false) String createdBefore,
    		@RequestParam(value = "lastEditAfter", required = false) String lastEditAfter,
    		@RequestParam(value = "lastEditBefore", required = false) String lastEditBefore,
    		Model model
            ) throws SolrServerException, IOException, URISyntaxException {
				
		return rs.getRois(imageId, roiId, userOwner, userGroup, createdAfter, createdBefore, lastEditAfter, lastEditBefore, resultNo);
		
    }

	
	@RequestMapping(value="/getChannels", method=RequestMethod.GET)	
    public @ResponseBody String getChannels(
            @RequestParam(value = "channelId", required = false) String channelId,
    		@RequestParam(value = "imageId", required = false) String imageId,
    		@RequestParam(value = "resultNo", required = false) Integer resultNo,
    		Model model
            ) throws SolrServerException, IOException, URISyntaxException {
		
		if (channelId != null){
			return cs.getChannelAsJsonString(channelId, resultNo);
		}else if (imageId != null){
			return cs.getChannels(imageId, resultNo);
		}
		return "";
    }
		
	
	@RequestMapping(value="/getRoi", method=RequestMethod.GET)	
    public @ResponseBody String getRoi(
    		@RequestParam(value = "roiId", required = false) String roiId,
    		Model model
            ) throws SolrServerException, IOException, URISyntaxException {
				
		if (roiId != null){
			return rs.getRoiAsJsonString(roiId, 10);
		}
		return "";
    }
	

	@RequestMapping(value="/getChannel", method=RequestMethod.GET)	
    public @ResponseBody String getChannel(
            @RequestParam(value = "channelId", required = false) String channelId,
    		Model model
            ) throws SolrServerException, IOException, URISyntaxException {
		
		if (channelId != null){
			return cs.getChannelAsJsonString(channelId, 10);
		}
		return "";
    }
	
	
	/**
	 * 
	 * @param model
	 * @return
	 * @throws SolrServerException
	 * @throws IOException
	 * @throws URISyntaxException
	 */
	@RequestMapping(value="/", method=RequestMethod.GET)	
    public String showSomething( Model model ) throws SolrServerException, IOException, URISyntaxException {
	
		System.out.println("Try /getImages .");
		return "rest_home";
    }
		
	
	/**
	 * @since 2015/08/18
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/getDataReleases", method=RequestMethod.GET)	
    public @ResponseBody String getDataRelease(Model model){
		return ns.getAllReleases().toString();
	}
	
	
}


