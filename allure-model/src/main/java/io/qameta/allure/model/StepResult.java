
package io.qameta.allure.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/**
 * <p>Java class for StepResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StepResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:model.allure.qameta.io}ExecutableItem"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
public class StepResult extends ExecutableItem implements Serializable {

    private static final long serialVersionUID = 1L;

    @Override
    public StepResult withName(final String value) {
        setName(value);
        return this;
    }

    @Override
    public StepResult withStatus(final Status value) {
        setStatus(value);
        return this;
    }

    @Override
    public StepResult withStatusDetails(final StatusDetails value) {
        setStatusDetails(value);
        return this;
    }

    @Override
    public StepResult withStage(final Stage value) {
        setStage(value);
        return this;
    }

    @Override
    public StepResult withDescription(final String value) {
        setDescription(value);
        return this;
    }

    @Override
    public StepResult withDescriptionHtml(final String value) {
        setDescriptionHtml(value);
        return this;
    }

    @Override
    public StepResult withStart(final Long value) {
        setStart(value);
        return this;
    }

    @Override
    public StepResult withStop(final Long value) {
        setStop(value);
        return this;
    }

    @Override
    public StepResult withSteps(final StepResult... values) {
        if (values != null) {
            for (StepResult value: values) {
                getSteps().add(value);
            }
        }
        return this;
    }

    @Override
    public StepResult withSteps(final Collection<StepResult> values) {
        if (values != null) {
            getSteps().addAll(values);
        }
        return this;
    }

    @Override
    public StepResult withSteps(final List<StepResult> steps) {
        setSteps(steps);
        return this;
    }

    @Override
    public StepResult withAttachments(final Attachment... values) {
        if (values != null) {
            for (Attachment value: values) {
                getAttachments().add(value);
            }
        }
        return this;
    }

    @Override
    public StepResult withAttachments(final Collection<Attachment> values) {
        if (values != null) {
            getAttachments().addAll(values);
        }
        return this;
    }

    @Override
    public StepResult withAttachments(final List<Attachment> attachments) {
        setAttachments(attachments);
        return this;
    }

    @Override
    public StepResult withParameters(final Parameter... values) {
        if (values != null) {
            for (Parameter value: values) {
                getParameters().add(value);
            }
        }
        return this;
    }

    @Override
    public StepResult withParameters(final Collection<Parameter> values) {
        if (values != null) {
            getParameters().addAll(values);
        }
        return this;
    }

    @Override
    public StepResult withParameters(final List<Parameter> parameters) {
        setParameters(parameters);
        return this;
    }
}