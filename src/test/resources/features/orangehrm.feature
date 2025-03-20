
Feature: Complete Recruitment Flow
  Scenario: Add a candidate after successful login
    Given "Juan" logs in with valid credentials
    When he creates a new candidate with complete fake data
    Then he shortlists the candidate
    And he schedules an interview for the candidate