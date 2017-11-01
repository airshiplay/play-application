package com.airlenet.play.maven.swagger;

import com.airlenet.play.maven.swagger.AbstractPlayMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;

/**
 * @goal process
 * @phase generate-sources
 * @requiresDependencyResolution compile
 * @threadSafe true
 *
 * @author airlenet
 * @version 2017-10-25
 */
public class SwaggerMojo extends AbstractPlayMojo {
    public void execute() throws MojoExecutionException, MojoFailureException {

        getLog().info("Swagger");
        getLog().info("Source Encoding:"+sourceEncoding);
        getLog().info(project.toString());
        getLog().info(project.getBuild().getOutputDirectory());
        getLog().info(outputDirectory.toString());
    }
}
