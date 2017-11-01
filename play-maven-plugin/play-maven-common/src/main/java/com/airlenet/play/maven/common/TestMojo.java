package com.airlenet.play.maven.common;

import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;

/**

 * ProcessorAnnotationMojo calls APT processors for code generation
 *
 * @goal process
 * @phase generate-sources
 * @requiresDependencyResolution compile
 * @threadSafe true
 * @author airlenet
 * @version 2017-10-25
 */
public class TestMojo extends AbstractPlayMojo{
    public void execute() throws MojoExecutionException, MojoFailureException {

    }
}
