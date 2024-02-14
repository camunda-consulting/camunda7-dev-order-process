package com.camunda.training;

import static org.camunda.bpm.engine.test.assertions.ProcessEngineTests.*;
import static org.assertj.core.api.Assertions.*;

import org.camunda.bpm.engine.test.Deployment;
import org.camunda.community.process_test_coverage.junit5.platform7.ProcessEngineCoverageExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@Deployment(resources = { "inventory-process.bpmn" })
@ExtendWith(ProcessEngineCoverageExtension.class)
public class InventoryUnitTest {

  public static final String INVENTORY_PROCESS_ID = "InventroyProcess";

  public static final String CHECK_AVAILABILITY_TASK = "Check availability";
  public static final String RESERVE_AVAILABLE_ITEMS_TASK = "Reserve available items";
  public static final String REMOVE_UNAVAILABLE_ITEMS_TASK = "Remove unavailable items";
  public static final String INVENTORY_COMPLETED_EVENT = "Inventory completed";

  public static final String AVAILABILITY_CHECK_TOPIC = "availabilityChek";
  public static final String ITEM_REMOVAL_TOPIC = "itemRemoval";
  public static final String ITEM_RESERVATION_TOPIC = "itemReservation";

  public static final String ORDER_ITEMS_NUM_VAR = "orderItemsNum";
  public static final String AVAILABLE_ITEMS_NUM_VAR = "availableItemsNu";

  @Test
  public void happy_path_test() {
    
  }

}
