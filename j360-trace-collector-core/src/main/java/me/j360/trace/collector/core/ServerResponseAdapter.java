package me.j360.trace.collector.core;


import java.util.Collection;

public interface ServerResponseAdapter {

    /**
     * Returns a collection of annotations that should be added to span
     * before returning response.
     *
     * Can be used to indicate more details about response.
     * For example information on error or unsuccessful reponse.
     *
     * @return Collection of annotations.
     */
    Collection<KeyValueAnnotation> responseAnnotations();
}
