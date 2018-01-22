/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Behavioral.Visitor.Visitors;

import Behavioral.Visitor.Elements.Element;
/**
 *
 * @author argshub
 */
public class ConcreteVisitor implements Visitor {
    
    @Override
    public void visit(Element element) {
        element.addContent("Visiting Content");
    }
}
