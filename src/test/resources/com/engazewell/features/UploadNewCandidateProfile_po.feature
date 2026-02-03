
Feature: UploadNewCandidateProfile_po @feature_upload_candidate_profile

Background: 
  Given the user is on the Profile section

@valid-upload
Scenario Outline: Upload New Candidate Profile
  When the user clicks on the upload (cloud) icon
  And the user browses and selects a valid candidate profile file
  And the user clicks on the Upload button
  And the user waits for the upload process to complete
  Then a success confirmation message should appear, indicating the profile was uploaded successfully

Examples:
  | candidate_profile_file |
  | valid_candidate_profile.pdf |
  | valid_candidate_profile.docx |

  @feature_upload_candidate_profile
  @successful-upload
  Scenario Outline: Upload New Candidate Profile
    When the recruiter clicks on the upload (cloud) icon
    And the recruiter browses and selects the <candidate_profile_file>
    And the recruiter clicks on the Upload button
    And the recruiter waits for the upload to complete and confirms success
    Then the recruiter should see a confirmation message for the <candidate_profile_file>
    And the recruiter should see both profiles listed in the Profile section

  Examples:
    | candidate_profile_file               |
    | first valid candidate profile file    |
    | second valid candidate profile file   |

  @feature_upload_candidate_profile
  @upload-profile
  Scenario Outline: Upload New Candidate Profile
    When the recruiter clicks on the upload (cloud) icon
    And the recruiter browses and selects a candidate profile file in a supported format
    And the recruiter clicks on the Upload button
    And the recruiter waits for the upload process to complete
    Then a success confirmation message should appear, indicating the profile was uploaded successfully

  Examples:
    | candidate_profile_file |
    | valid_candidate_profile.pdf |

  @upload_long_filename
  Scenario Outline: Upload New Candidate Profile
    When the user clicks on the upload (cloud) icon
    And the user browses and selects a candidate profile file with a long filename <long_filename>
    And the user clicks on the Upload button
    And the user waits for the upload process to complete
    Then the user should see a success confirmation message indicating the profile was uploaded successfully

    Examples:
      | long_filename                                                        |
      | This_is_a_very_long_filename_for_a_candidate_profile_document.pdf   |

  @feature_upload_candidate_profile
  @valid-upload
  Scenario Outline: Upload New Candidate Profile
    When the user clicks on the upload (cloud) icon
    And the user browses and selects a candidate profile file with metadata
    And the user clicks on the Upload button
    And the user waits for the upload process to complete
    Then the metadata should be displayed correctly in the Profile section

  Examples:
    | candidate_profile_file |
    | <candidate_profile_file> |

  @valid-upload
  Scenario Outline: Upload New Candidate Profile
    When the user clicks on the upload (cloud) icon
    And the user browses and selects a candidate profile file with a valid extension
    And the user clicks on the Upload button
    And the user waits for the upload process to complete
    Then a success confirmation message should be displayed indicating the profile was uploaded successfully

    Examples:
      | file_extension |
      | RTF            |

@successful-profile-upload
Scenario Outline: Upload New Candidate Profile
  When the Hiring Manager clicks on the upload icon
  And the Hiring Manager browses and selects a valid candidate profile file
  And the Hiring Manager clicks on the Upload button
  And the Hiring Manager waits for the upload process to complete
  Then a success confirmation message appears, indicating the profile was uploaded successfully

Examples:
  | valid_candidate_profile_file |
  | <valid_candidate_profile_file> |

@successful_upload
Scenario Outline: Upload New Candidate Profile
  When the Hiring Manager clicks on the upload icon
  And the Hiring Manager browses and selects a candidate profile file in a different format
  And the Hiring Manager clicks on the Upload button
  And the Hiring Manager waits for the upload process to complete
  Then a success confirmation message appears, indicating the profile was uploaded successfully

Examples:
  | candidate_profile_file |
  | RTF                    |

  @feature_upload_new_candidate_profile
  @upload_multiple_profiles
  Scenario Outline: Upload New Candidate Profile
    When the user clicks on the upload (cloud) icon
    And the user browses and selects multiple valid candidate profile files
    And the user clicks on the Upload button
    And the user waits for the upload process to complete
    Then the user should see all uploaded profiles listed in the Profile section

  Examples:
    | candidate_profile_files       |
    | file1.pdf, file2.pdf, file3.pdf |
