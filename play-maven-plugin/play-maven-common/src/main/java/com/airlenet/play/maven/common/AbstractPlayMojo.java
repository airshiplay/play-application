package com.airlenet.play.maven.common;

import org.apache.maven.artifact.Artifact;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.project.MavenProject;
import org.sonatype.plexus.build.incremental.BuildContext;

import java.io.File;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author airlenet
 * @version 2017-10-25
 */
public abstract class AbstractPlayMojo  extends AbstractMojo {

    /**
     * @parameter
     */
    protected File outputDirectory;
    /**
     * @component
     */
    protected BuildContext buildContext;

    /**
     * @parameter expression="${project}" readonly=true required=true
     */
    protected MavenProject project;

    /**
     * @parameter expression="${project.build.sourceEncoding}" required=true
     */
    protected String sourceEncoding;

    /**
     * @parameter
     */
    protected Map<String, String> options;

    /**
     * @parameter
     */
    protected Map<String, String> compilerOptions;

    /**
     * @parameter
     */
    protected Set<String> includes = new HashSet<String>();

    /**
     * @parameter
     */
    protected boolean showWarnings = true;

    /**
     * @parameter
     */
    protected List<String> excludes;
    /**
     * @parameter
     */
    protected boolean logOnlyOnError = false;

    /**
     * @parameter expression="${plugin.artifacts}" readonly=true required=true
     */
    protected List<Artifact> pluginArtifacts;

    /**
     * A list of additional source roots for the apt processor
     *
     * @parameter required=false
     */
    protected List<String> additionalSourceRoots;

    /**
     * A list of additional test source roots for the apt processor
     *
     * @parameter required=false
     */
    protected List<String> additionalTestSourceRoots;

    /**
     * @parameter
     */
    protected boolean ignoreDelta = true;
}
