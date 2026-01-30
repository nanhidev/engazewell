
@feature_upload_new_candidate_profile
Feature: UploadNewCandidateProfile_po

Background: 
  Given the user is on the Profile section

@valid-upload
Scenario Outline: Upload New Candidate Profile
  When the user clicks on the upload (cloud) icon
  And the user browses and selects a valid candidate profile file
  And the user clicks on the Upload button
  And the user waits for the upload process to complete
  Then a success confirmation message appears, indicating the profile was uploaded successfully

  Examples:
    | candidate_profile_file |
    | valid_profile.pdf      |
    | valid_profile.docx     |

@upload-first-profile
Scenario Outline: Upload New Candidate Profile
  When the recruiter clicks on the upload (cloud) icon
  And the recruiter browses and selects the "<candidate_profile_file>"
  And the recruiter clicks on the Upload button
  Then the recruiter waits for the upload to complete and confirms success

  Examples:
    | candidate_profile_file       |
    | first_valid_candidate_file   |
    | second_valid_candidate_file  |

  @upload-candidate-profile
  Scenario Outline: Upload New Candidate Profile
    When the user clicks on the upload (cloud) icon
    And the user browses and selects a candidate profile file in a supported format
    And the user clicks on the Upload button
    And the user waits for the upload process to complete
    Then the user observes a confirmation message displayed

    Examples:
      | file_format |
      | PDF         |
      | DOCX        |

  @long-filename-upload
  Scenario Outline: Upload New Candidate Profile
    When the user clicks on the upload (cloud) icon
    And the user browses and selects a candidate profile file with a long filename
    And the user clicks on the Upload button
    And the user waits for the upload process to complete
    Then the user should observe a success confirmation message indicating the profile was uploaded successfully

    Examples:
      | filename                                                 |
      | This_is_a_very_long_filename_for_a_candidate_profile_document.pdf |

  @feature_upload_candidate
  @valid-upload
  Scenario Outline: Upload New Candidate Profile
    Given the user clicks on the upload (cloud) icon
    When the user browses and selects a candidate profile file with metadata
    And the user clicks on the Upload button
    Then the upload process initiates without errors
    And the metadata is displayed correctly in the Profile section after upload

    Examples:
      | candidate_profile_file |
      | <candidate_profile_file> |

  @feature_upload_candidate
  @valid-upload
  Scenario Outline: Upload New Candidate Profile
    When I click on the upload icon
    And I browse and select a candidate profile file with a different valid extension
    And I click on the Upload button
    And I wait for the upload process to complete
    Then a confirmation message is displayed

    Examples:
      | file_extension |
      | RTF            |

  @successful-upload
  Scenario Outline: Upload New Candidate Profile
    Given the user clicks on the upload icon
    When the user browses and selects a valid candidate profile file
    And the user clicks on the Upload button
    And the user waits for the upload process to complete
    Then the user observes the confirmation message displayed

    Examples:
      | Profile File         |
      | ValidProfile.pdf     |
      | CandidateProfile.docx |

  @feature_upload_new_candidate_profile
  @upload-valid-profile
  Scenario Outline: Upload New Candidate Profile
    When the Hiring Manager clicks on the upload icon
    And the Hiring Manager browses and selects a candidate profile file in a different format
    And the Hiring Manager clicks on the Upload button
    Then the upload process should complete
    And a success confirmation message should appear, indicating the profile was uploaded successfully

    Examples:
      | candidate_profile_file |
      | candidate_profile.rtf  |

  @feature_upload_new_candidate_profile
  @upload-multiple-candidates
  Scenario Outline: Upload New Candidate Profile
    When the Hiring Manager clicks on the upload icon
    And the Hiring Manager browses and selects multiple valid candidate profile files
    And the Hiring Manager clicks on the Upload button
    Then the upload process completes successfully for each file
    And all uploaded profiles are listed in the Profile section

  Examples:
    | files                                      |
    | Candidate1.pdf, Candidate2.pdf, Candidate3.pdf |
