package fr.unice.i3s.sigma.examples.pl14.benchmark;

import java.io.File;

import org.eclipse.emf.ecore.resource.Resource;

public interface M2TMicroBenchmark {

	public void pre(Resource resource) throws Exception;
	
	public void run(Resource resource, File targetDir) throws Exception;
	
	public void post(Resource resource) throws Exception;
	
}